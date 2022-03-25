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
	
	private JPanel panel1,panel2;
	private JButton button1,button2;
	private JTextField text1;
			
	public GUI() {
		
		setTitle("Topic Modeller");//to name the GUI
		setSize(400,400);//set width
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.black);//set background colour

			
			
		// create / instantiate the GUI components and add listener
		button1 = new JButton("Check");//button for checking if the files are similar 
		button2 = new JButton("Stop Words");//button to see stop words
		
		text1 = new JTextField("File chooser");//to enter file
		
		panel1 = new JPanel();
		panel1.setBackground(Color.white);//set background colour of panel to white
		panel1.add(text1);
		add(panel1);//to add panel
		
		panel2 = new JPanel();
		panel2.setBackground(Color.white);//set background colour of panel to white
		panel2.add(button1);
		panel2.add(button2);
		add(panel2);//to add panel
		
		//for adding actions to the buttons
		button1.addActionListener(this);
		button2.addActionListener(this);
		  	   
		setVisible(true);//to allow us to see the gui
	}//end GUI

	@Override
	public void actionPerformed(ActionEvent e) {
		
				
	}//end actionPerformed
		
	

}
