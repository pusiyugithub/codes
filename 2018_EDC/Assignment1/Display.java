import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Display implements Gui {
	public Controller controller = null;
	private JFrame frame= null;
	private JTextField textField = null;
	private JButton coinInsert = null;
	private JButton goStop = null;
	

	@Override
	public void connect(Controller controller) {
		this.controller = controller;
		// TODO Auto-generated method stub
	}

	@Override
	public void init() {
		frame = new JFrame();
		frame.setSize(400, 300);
		textField = new JTextField();
		textField.setBounds(150, 50, 100, 50);
		coinInsert = new JButton("Coin Inserted");
		goStop = new JButton("Go/Stop");
		coinInsert.addActionListener(new CoinInsert(this.controller));
		goStop.addActionListener(new GoStop(this.controller));
		coinInsert.setBounds(50, 200, 100, 50);
		goStop.setBounds(250, 200, 100, 50);
		frame.add(textField);
		frame.add(coinInsert);
		frame.add(goStop);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		// TODO Auto-generated method stub

	}

	@Override
	public void setDisplay(String s) {
		textField.setText(s);
		// TODO Auto-generated method stub

	}
	

}
class CoinInsert implements ActionListener{
	public Controller controller;
	CoinInsert(Controller controller){
		this.controller = controller;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		this.controller.coinInserted();
	}
	
}

class GoStop extends JButton implements ActionListener{
	public Controller controller;
	GoStop(Controller controller){
		this.controller = controller;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		this.controller.goStopPressed();
		// TODO Auto-generated method stub
	}
	
}


interface State {
	public void display();
}

class State0 implements State{
	private SimpleReactionController s  = null;
	private EnhancedReactionController c = null;
	State0(SimpleReactionController s){
		this.s = s;
		display();
	}
	State0(EnhancedReactionController c){
		this.c = c;
		display();
	}
	@Override
	public void display() {
		if(s!=null){
			s.getGui().setDisplay("Insert coin");
		}
		// TODO Auto-generated method stub
		else if(c!=null){
			c.getGui().setDisplay("Insert coin");
		}

		
	}
	
	
}

class State1 implements State{
	private SimpleReactionController s  = null;
	private EnhancedReactionController c = null;
	State1(EnhancedReactionController c){
		this.c =c;
		display();
	}
	State1(SimpleReactionController s){
		this.s = s;
		display();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(s!=null){
			s.getGui().setDisplay("Press GO!");
		}
		else if(c!=null)
		{
			c.getGui().setDisplay("Press GO!");
		}
	}
}


class State2 implements State{
	private SimpleReactionController s  = null;
	private EnhancedReactionController c  = null;
	
	State2(SimpleReactionController s){
		this.s = s;
		display();
		
	}
	
	State2(EnhancedReactionController c){
		this.c = c;
		display();
		
	}
	
	public void display(){
		if(s!=null){
			s.getGui().setDisplay("Wait...");
		}
		else if(c!=null){
			c.getGui().setDisplay("Wait...");
		}
		
	}
	
}

class State3 implements State{
	
	private SimpleReactionController s  = null;
	private EnhancedReactionController c  = null;
	State3(SimpleReactionController s){
		this.s = s;
		display();
	}
	State3(EnhancedReactionController c){
		this.c = c;
		display();
	}
	
	public void display(){
		if(s!=null){
			s.getGui().setDisplay(String.valueOf(String.format("%.2f", s.getTime()/100)));
		}
		else if(c!=null){
			c.getGui().setDisplay(String.valueOf(String.format("%.2f", c.getTime()/100)));
		}
		
	}
	
	 
	
	
}

class State4 implements State{
	private SimpleReactionController s  = null;
	private EnhancedReactionController c  = null;
	State4(SimpleReactionController s){
		this.s = s;
		display();
		
	}
	State4(EnhancedReactionController c){
		this.c = c;
		display();
		
	}
	
	public void display(){
		if(s!=null){
			s.getGui().setDisplay(String.valueOf(String.format("%.2f",s.getFinalTime()/100)));
		}
		else if(c!=null){
			c.getGui().setDisplay(String.valueOf(String.format("%.2f",c.getFinalTime()/100)));
		}
		
	}
}
class State5 implements State{
	private EnhancedReactionController c = null;
	State5(EnhancedReactionController c){
		this.c = c;
	}
	@Override
	public void display() {
		c.getGui().setDisplay("Average="+String.valueOf(String.format("%.2f", c.getAverageTime()/100)));
		// TODO Auto-generated method stub
		
	}
	
}




