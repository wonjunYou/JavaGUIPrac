import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxItemEventEx extends JFrame{
	JCheckBox [] fruits = new JCheckBox [3];
	String [] names = {"사과", "배" , "체리"};
	JLabel sumLabel;
	
	CheckBoxItemEventEx(){
		setTitle("과일 골라");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("사과 100 배 200 체리 50"));
		MyItemListener listener = new MyItemListener();
		for (int i =0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]); 
			fruits[i].setBorderPainted(true); 
			c.add(fruits[i]); 
			fruits[i].addItemListener(listener);
		}
		sumLabel = new JLabel("현재 0원 입니다.");
		c.add(sumLabel);
		setSize(250,200);
		setVisible(true);

	}
	class MyItemListener implements ItemListener{
		int sum =0;
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED) {
				if(e.getItem() == fruits[0]) {
					sum +=100;
				}
				else if(e.getItem() ==fruits[1]) {
					sum+=200;
				}
				else {
					sum+=50;
				}
			}
			else {
				if(e.getItem() == fruits [0]) {
					sum -=100;
				}
				else if (e.getItem() ==fruits[1]) {
					sum -=200;
				}
				else {
					sum -=50;
				}
			}
			sumLabel.setText("현재 "+ sum+ "원 입니다.");
			
		}
	}
	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}
}
