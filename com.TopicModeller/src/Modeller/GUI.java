package Modeller;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener {
	/*
	 * This class allows us to have a gui interface 
	 * It will give us options to pick a file and check if they're similar or not
	 */
	
	private JPanel panel1,panel2,panel3,panel4,panel5,panel6,panel7;
	private JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11;
	private JTextField text1;
			
	public GUI() {
		
		setTitle("Topic Modeller");//to name the GUI
		setSize(250,400);//set width
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.blue);//set background colour

			
			
		// create / instantiate the GUI components and add listener
		button1 = new JButton("Check");//button for checking if the files are similar 
		button2 = new JButton("Read Documents");//button to see stop words
		button3 = new JButton("Doc word count");
		button4 = new JButton("Common Words");
		button5 = new JButton("Uncommon Words");
		button6 = new JButton("Stop Words");//button to see stop words
		button7 = new JButton("Overlapping Words");
		button8 = new JButton("Most Common Words");
		button9 = new JButton("Filter");
		button10 = new JButton("Add stop words");
		button11 = new JButton("Save");
		
		text1 = new JTextField("File chooser");//to enter file
		
		panel1 = new JPanel();
		panel1.setBackground(Color.green);//set background colour of panel to green
		panel1.add(text1);
		add(panel1);//to add panel
		
		panel2 = new JPanel();
		panel2.setBackground(Color.yellow);//set background colour of panel to yellow
		panel2.add(button1);
		panel2.add(button2);
		add(panel2);//to add panel
		
		panel3 = new JPanel();
		panel3.setBackground(Color.green);//set background colour of panel to green
		panel3.add(button3);
		panel3.add(button4);
		add(panel3);//to add panel
		
		panel4 = new JPanel();
		panel4.setBackground(Color.yellow);//set background colour of panel to yellow
		panel4.add(button5);
		panel4.add(button6);
		add(panel4);//to add panel
		
		
		panel5 = new JPanel();
		panel5.setBackground(Color.green);//set background colour of panel to green
		panel5.add(button7);
		panel5.add(button8);
		add(panel5);//to add panel
		
		panel6 = new JPanel();
		panel6.setBackground(Color.yellow);//set background colour of panel to yellow
		panel6.add(button9);
		panel6.add(button10);
		add(panel6);//to add panel
		
		panel7 = new JPanel();
		panel7.setBackground(Color.green);//set background colour of panel to green
		panel7.add(button11);
		add(panel7);//to add panel
		
		//for adding actions to the buttons
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button10.addActionListener(this);
		button11.addActionListener(this);
		  	   
		setVisible(true);//to allow us to see the gui
	}//end GUI

	@Override
	public void actionPerformed(ActionEvent e) {
		
				
	}//end actionPerformed
		
	

}
