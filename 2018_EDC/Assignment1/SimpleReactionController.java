
public class SimpleReactionController implements Controller {
	private Gui gui = new Display();
	private Random rng = null;
	private State state = null;
	private float time;
	private float finalTime;

	public Gui getGui(){
		return gui;
	}
	
	public Random getRng(){
		return rng;
	}
	
	public float getTime(){
		return time;
	}
	
	public float getFinalTime(){
		return finalTime;
	}
	@Override
	public void connect(Gui gui, Random rng) {
		this.gui = gui;
		this.rng = rng;
		// TODO Auto-generated method stub
	}

	@Override
	public void init() {

		state = new State0(this);
		time = 0;
		finalTime = 0;
		// TODO Auto-generated method stub

	}

	@Override
	public void coinInserted() {
		if(state instanceof State0){
			state = new State1(this);
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void goStopPressed() {
		if(state instanceof State1){
			time = rng.getRandom(100, 250);
			state = new State2(this);
		}
		else if(state instanceof State2){
			init();
		}
		else if(state instanceof State3){
			finalTime = time;
			time = 0;
			state = new State4(this);

		}
		else if(state instanceof State4){
			init();
		}

	}

	@Override
	public void tick() {
		
		if(state instanceof State2){
			time--;
			((State2) state).display();
			
			if(time == 0){
				state = new State3(this);
			}
		}
		
		else if(state instanceof State3){
			time++;
			((State3) state).display();
			if(time == 200){
				init();
			}
		}
		
		else if(state instanceof State4){
			time++;
			((State4) state).display();
			if(time == 300){
				init();
			}
		}
		// TODO Auto-generated method stub

	}
	
	

}




