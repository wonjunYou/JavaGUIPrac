import javax.swing.*;
import java.awt.*;


public class Ex02 extends JFrame{
	Ex02(){
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("�ȳ�");
		
		ImageIcon img = new ImageIcon("images/gosling.jpg");
		JLabel imageLabel = new JLabel(img);
		
		ImageIcon icon = new ImageIcon("images/icon.gif");
		JLabel label = new JLabel("����");
		
		c.add(textLabel); c.add(imageLabel); c.add(label);
		setSize(300,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		//JLabel textLabel = new JLabel("����մϴ�");
		// ImageIconimage = new ImageIcon("images/sunset.jpg");
		
	}
}
