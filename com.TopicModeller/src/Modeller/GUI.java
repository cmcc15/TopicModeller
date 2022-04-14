package Modeller;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileSystemView;

public class GUI extends JFrame implements ActionListener {
	/*
	 * This class allows us to have a gui interface 
	 * It will give us options to pick a file and check if they're similar or not
	 */
	
	private JPanel panel1,panel2,panel3,panel4,panel5,panel6,panel7;
	private JButton FC1, FC2, button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11;
	private JTextField text1;
	private int wordcount1,wordcount2;
	private String test;
			
	public GUI() {
		
		setTitle("Topic Modeller");//to name the GUI
		setSize(250,400);//set width
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.blue);//set background colour

			
			
		// create / instantiate the GUI components and add listener
		FC1 = new JButton("First Chooser");//to select a document
		FC2 = new JButton("Second Chooser");//to select a document
		button1 = new JButton("Check");//button for checking if the files are similar 
		button2 = new JButton("Read Documents");//button to see stop words
		button3 = new JButton("Doc word count");//button to get word count
		button4 = new JButton("Common Words");//button to see common words
		button5 = new JButton("Uncommon Words");//button to see Uncommon words
		button6 = new JButton("Stop Words");//button to see stop words
		button7 = new JButton("Overlapping Words");//button to see Overlapping words
		button8 = new JButton("Most Common Words");//button to see most common word
		button9 = new JButton("Filter");//filter will sort the document 
		button10 = new JButton("Add stop words");//to add a stop word
		button11 = new JButton("Save");//to save the document
		
		text1 = new JTextField("File chooser");//to enter file
		
		panel1 = new JPanel();
		panel1.setBackground(Color.green);//set background colour of panel to green
		panel1.add(FC1);
		panel1.add(FC2);
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
		FC1.addActionListener(this);
		FC2.addActionListener(this);
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
	
	TopicModeller handle = new TopicModeller();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
			try {
				handle.Similar();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(e.getSource()==button2) {
			try {
				handle.toRead();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(e.getSource()==button3) {
			//count++;
			try {
				wordcount1=handle.doc1Wordcount();
				wordcount2=handle.doc2Wordcount();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("The word count of the first document is :" + wordcount1);
			System.out.println("The word count of the second document is :" + wordcount2);
		}
		
		if(e.getSource()==button4) {
			try {
				handle.Common();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		if(e.getSource()==button5) {
			try {
				handle.Uncommon();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		if(e.getSource()==button6) {
			try {
				handle.toReadStop();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		if(e.getSource()==button7) {
			try {
				handle.Overlap();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		if(e.getSource()==button8) {
			try {
				handle.MostCommon();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		if(e.getSource()==button9) {
			try {
				handle.Sort();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		if(e.getSource()==button10) {
			handle.Add();
		}

		if(e.getSource()==button11) {
			handle.Save();
		}
				
	}//end actionPerformed
		
	

}//end GUI
