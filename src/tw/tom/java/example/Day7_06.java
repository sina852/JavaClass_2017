package tw.tom.java.example;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Day7_06  extends JFrame{

	private JLabel label;
	public Day7_06() 
	{
		super.setTitle("視窗程式");
		setLayout(new FlowLayout());
		
		label = new JLabel("Hello,Wold");
		add(label);
		label.addMouseListener(new MyMouseAdapter() );
		setSize(480,320);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	private class MyMouseAdapter extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			label.setText("" + (int)(Math.random()*49+1));
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new Day7_06() ;
	}

}
