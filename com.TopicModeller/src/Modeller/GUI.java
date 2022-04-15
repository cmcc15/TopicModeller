package Modeller;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener {
	/*
	 * This class allows us to have a gui interface 
	 * It will give us options to pick a file and check if they're similar or not
	 */
	
	private JPanel panel1,panel2,panel3,panel4,panel5,panel6;
	private JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11;
	private JTextField text1;
	private int wordcount1,wordcount2;
			
	public GUI() {
		
		setTitle("Topic Modeller");//to name the GUI
		setSize(300,400);//set width
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.blue);//set background colour

			
			
		// create / instantiate the GUI components and add listener
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
		button11 = new JButton("Remove stop words");//to save the document
		
		text1 = new JTextField("File chooser");//to enter file
		
		
		panel1 = new JPanel();
		panel1.setBackground(Color.yellow);//set background colour of panel to yellow
		panel1.add(button1);
		panel1.add(button2);
		add(panel1);//to add panel
		
		panel2 = new JPanel();
		panel2.setBackground(Color.green);//set background colour of panel to green
		panel2.add(button3);
		panel2.add(button4);
		add(panel2);//to add panel
		
		panel3 = new JPanel();
		panel3.setBackground(Color.yellow);//set background colour of panel to yellow
		panel3.add(button5);
		panel3.add(button6);
		add(panel3);//to add panel
		
		
		panel4 = new JPanel();
		panel4.setBackground(Color.green);//set background colour of panel to green
		panel4.add(button7);
		panel4.add(button8);
		add(panel4);//to add panel
		
		panel5 = new JPanel();
		panel5.setBackground(Color.yellow);//set background colour of panel to yellow
		panel5.add(button9);
		panel5.add(button10);
		add(panel5);//to add panel
		
		panel6 = new JPanel();
		panel6.setBackground(Color.green);//set background colour of panel to green
		panel6.add(button11);
		add(panel6);//to add panel
		
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
	
	TopicModeller handle = new TopicModeller();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
			//for checking if the documents are similar
			try {
				handle.Similar();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(e.getSource()==button2) {
			//for readding the documents
			try {
				handle.toRead();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(e.getSource()==button3) {
			//check the document word count
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
			//to see common words 
			try {
				handle.Common();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		if(e.getSource()==button5) {
			//to see uncommon words 
			try {
				handle.Uncommon();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		if(e.getSource()==button6) {
			//to see stop words
			try {
				handle.toReadStop();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		if(e.getSource()==button7) {
			//to see overlapping words - gives a shorter breakdown if the files are similar 
			try {
				handle.Overlap();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		if(e.getSource()==button8) {
			//to see most common words
			try {
				handle.MostCommon();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
		}

		if(e.getSource()==button9) {
			//to filter the documents alaphabetically
			try {
				handle.Sort1();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				handle.Sort2();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		if(e.getSource()==button10) {
			//to add a stop word
			handle.Add();
		}
		
		if(e.getSource()==button11) {
			//to remove stop words
			try {
				handle.Remove();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
				
	}//end actionPerformed
		
	

}//end GUI
