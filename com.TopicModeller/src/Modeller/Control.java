package Modeller;

import java.io.FileNotFoundException;

public class Control {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		TopicModeller handle = new TopicModeller();
		
		handle.toRead();//to read the files
		handle.Uncommon();//to see uncommonon words
        
        	
    }


}
