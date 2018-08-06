
public class EnhancedReactionController implements Controller {
	private Gui gui = new Display();
	private Random rng = null;
	private State state = null;
	private float time;
	private float finalTime;
	private float[] score = null;
	private int index;
	private float averageTime;

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
	
	public float getAverageTime(){
		return averageTime;
	}
	@Override
	public void connect(Gui gui, Random rng) {
		// TODO Auto-generated method stub
		this.gui = gui;
		this.rng = rng;
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		state = new State0(this);
		time = 0;
		finalTime = 0;
		score = new float[3];
		index = 0;
		averageTime = 0;
	}

	@Override
	public void coinInserted() {
		// TODO Auto-generated method stub
		if(state instanceof State0){
			state = new State1(this);
		}
	}

	@Override
	public void goStopPressed() {
		// TODO Auto-generated method stub
		if(state instanceof State1){
			time = rng.getRandom(100, 250);
			
			state = new State2(this);
		}
		else if(state instanceof State2){
			init();
		}
		else if(state instanceof State3){
			score[index] = time;
			index++;
			finalTime = time;
			time = 0;
			state = new State4(this);

		}
		else if(state instanceof State4){
			if(index<3){
				time = rng.getRandom(100, 250);
				state = new State2(this);
			}
			else{
				time = 0;
				averageTime = (float)(score[0]+score[1]+score[2])/3;
				state = new State5(this);
			}
		}
		else if(state instanceof State5){
			init();
		}

	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		if(state instanceof State1){
			time++;
			state.display();
			if(time == 1000){
				init();
			}
		}
		if(state instanceof State2){
			time--;
			state.display();
			
			if(time == 0){
				state = new State3(this);
			}
		}
		
		else if(state instanceof State3){
			time++;
			state.display();
			if(time == 200){
				score[index] = time;
				index++;
				finalTime = time;
				time = 0;
				state = new State4(this);
				
			}
		}
		
		else if(state instanceof State4){
			time++;
			state.display();
			if(time == 300){
				if(index<3){
					time = rng.getRandom(100, 250);
					state = new State2(this);
				}
				else{
					time = 0;
					averageTime = (float)(score[0]+score[1]+score[2])/3;
					state = new State5(this);
				}
			}
		}
		else if(state instanceof State5){
			time++;
			state.display();
			if(time == 500){
				init();
			}
		}
	}

}


