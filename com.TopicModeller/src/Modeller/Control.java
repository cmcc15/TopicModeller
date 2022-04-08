package Modeller;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Control {
	
	public static void main(String[] args) throws IOException {
		
		TopicModeller handle = new TopicModeller();
		
		//handle.toReadFirst();//to read the files
		//handle.toReadSecond();
		
		//handle.toRead();
		//handle.Uncommon();//to see uncommonon words
		//handle.Overlap();
		//handle.addStop();
		
		handle.Remove();
		
		handle.Common();
		
		handle.Overlap();
		
		//handle.Add();
		
		handle.MostCommon();
        
		
		//GUI modGUI =new GUI();
		
        	
    }


}



