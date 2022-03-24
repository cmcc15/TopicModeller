package Modeller;

import java.io.File;

public class FileProcessor {
	String fileName;
	File roles;
		
	public FileProcessor(String fileName)
	{
		setFileName(fileName);
	}
		
	public String getFileName() {
		return fileName;
	}

	//  setting file name
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	// open file
	public void openFile() {
		roles = new File(fileName);
	}
		
}

