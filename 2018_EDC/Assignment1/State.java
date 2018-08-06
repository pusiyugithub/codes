//
//public interface State {
//	public void display();
//}
//
//class State0 implements State{
//	private SimpleReactionController s  = null;
//	private EnhancedReactionController c = null;
//	State0(SimpleReactionController s){
//		this.s = s;
//		display();
//	}
//	State0(EnhancedReactionController c){
//		this.c = c;
//		display();
//	}
//	@Override
//	public void display() {
//		if(s!=null){
//			s.getGui().setDisplay("Insert coin");
//		}
//		// TODO Auto-generated method stub
//		else if(c!=null){
//			c.getGui().setDisplay("Insert coin");
//		}
//
//		
//	}
//	
//	
//}
//
//class State1 implements State{
//	private SimpleReactionController s  = null;
//	private EnhancedReactionController c = null;
//	State1(EnhancedReactionController c){
//		this.c =c;
//		display();
//	}
//	State1(SimpleReactionController s){
//		this.s = s;
//		display();
//	}
//	@Override
//	public void display() {
//		// TODO Auto-generated method stub
//		if(s!=null){
//			s.getGui().setDisplay("Press Go!");
//		}
//		else if(c!=null)
//		{
//			c.getGui().setDisplay("Press Go!");
//		}
//	}
//}
//
//
//class State2 implements State{
//	private SimpleReactionController s  = null;
//	private EnhancedReactionController c  = null;
//	
//	State2(SimpleReactionController s){
//		this.s = s;
//		display();
//		
//	}
//	
//	State2(EnhancedReactionController c){
//		this.c = c;
//		display();
//		
//	}
//	
//	public void display(){
//		if(s!=null){
//			s.getGui().setDisplay("Wait...");
//		}
//		else if(c!=null){
//			c.getGui().setDisplay("Wait...");
//		}
//		
//	}
//	
//}
//
//class State3 implements State{
//	
//	private SimpleReactionController s  = null;
//	private EnhancedReactionController c  = null;
//	State3(SimpleReactionController s){
//		this.s = s;
//		display();
//	}
//	State3(EnhancedReactionController c){
//		this.c = c;
//		display();
//	}
//	
//	public void display(){
//		if(s!=null){
//			s.getGui().setDisplay(String.valueOf(String.format("%.2f", s.getTime()/100)));
//		}
//		else if(c!=null){
//			c.getGui().setDisplay(String.valueOf(String.format("%.2f", c.getTime()/100)));
//		}
//		
//	}
//	
//	 
//	
//	
//}
//
//class State4 implements State{
//	private SimpleReactionController s  = null;
//	private EnhancedReactionController c  = null;
//	State4(SimpleReactionController s){
//		this.s = s;
//		display();
//		
//	}
//	State4(EnhancedReactionController c){
//		this.c = c;
//		display();
//		
//	}
//	
//	public void display(){
//		if(s!=null){
//			s.getGui().setDisplay(String.valueOf(String.format("%.2f",s.getFinalTime()/100)));
//		}
//		else if(c!=null){
//			c.getGui().setDisplay(String.valueOf(String.format("%.2f",c.getFinalTime()/100)));
//		}
//		
//	}
//}
//class State5 implements State{
//	private EnhancedReactionController c = null;
//	State5(EnhancedReactionController c){
//		this.c = c;
//	}
//	@Override
//	public void display() {
//		c.getGui().setDisplay("Average="+String.valueOf(String.format("%.2f", c.getAverageTime()/100)));
//		// TODO Auto-generated method stub
//		
//	}
//	
//}
//
