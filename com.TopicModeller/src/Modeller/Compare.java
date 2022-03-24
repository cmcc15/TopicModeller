package Modeller;

public class Compare {
	FileProcessor process1,process2;
	
	// set role
	public void setRole(String role)
	{
		//Instantiating an object for file processor
		process1 = new FileProcessor("Liverpool.txt");
		process2 = new FileProcessor("Lakers.txt");

		// opening file
		process1.openFile();
		process2.openFile();
			
			
	}
		

}
