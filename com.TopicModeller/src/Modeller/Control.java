package Modeller;

import java.io.FileNotFoundException;

public class Control {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		TopicModeller handle = new TopicModeller();
		
		//handle.toReadFirst();//to read the files
		//handle.toReadSecond();
		
		handle.toRead();
		//handle.Uncommon();//to see uncommonon words
		//handle.Overlap();
		//handle.addStop();
		
		//handle.Common();
        
		
		//GUI modGUI =new GUI();
		
        	
    }


}
