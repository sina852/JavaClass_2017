package tw.tom.java.example;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Day6_winform extends JFrame {
	 //Day6_winform has_a  JButton obj
	 //Day6_winform is_a   JFrame
	 JButton open,save,exit;
	 JTextArea area;
	public Day6_winform() 
	{		
		super("視窗程式 V1");
		//FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
	
		//setLayout(new FlowLayout(FlowLayout.CENTER));
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new FlowLayout());
		
		
		open  = new JButton("open");
		save = new JButton("save");
		exit = new JButton("exit");
		top.add(open);top.add(save);top.add(exit);
		area = new JTextArea();
		add(top,BorderLayout.NORTH);
		add(area,BorderLayout.CENTER);
		
//		MyListener listener = new MyListener(this);
//		open.addActionListener(listener);
//		save.addActionListener(listener);
//		exit.addActionListener(listener);
		
		open.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, e.getActionCommand());						
			}
		});
		
		save.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, e.getActionCommand());				
			}
		});
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, e.getActionCommand());		
				
			}
		});
		
		
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Day6_winform();	
	}

}




class MyListener implements ActionListener
{
    private Day6_winform obj;
    public MyListener(Day6_winform Day6_winform ) 
    {
    	obj=Day6_winform;
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==obj.open) 
		{
			JOptionPane.showMessageDialog(null, e.getActionCommand());			
			
		}else if(e.getSource()==obj.save) 
		{
			System.out.println("save");
		}else if(e.getSource()==obj.exit) 
		{
			System.out.println("exit");
		}else 
		{
			System.out.println("debug");
		}
			
		//JOptionPane.showMessageDialog(null, e.getActionCommand());
		
	}

}