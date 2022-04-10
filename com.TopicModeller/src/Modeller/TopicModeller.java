package Modeller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class TopicModeller {
	
	
	int file1Wordcount() throws FileNotFoundException{
		
		Scanner file1 = new Scanner(new File("Liverpool.txt"));//this is for reading the first file
		ArrayList<String> list = new ArrayList<String>();
		        
		while (file1.hasNextLine())
			list.add(file1.nextLine());
		        
		    
		System.out.println(list);
		
		int wordcount = 0;
	    for(String s:list) {         
	    	wordcount += s.split(" ").length;
	    }    
	    System.out.println(wordcount);
	    return wordcount;
	
	
	}
	
	public int file2Wordcount() throws FileNotFoundException{
		Scanner myScanner = new Scanner(new File("Lakers.txt"));//this is for reading the second file
		
		ArrayList<String> list = new ArrayList<String>();
		
		while (myScanner.hasNextLine())
			list.add(myScanner.nextLine());

		System.out.println(list);
		
		int wordcount = 0;
	    for(String s:list) {         
	    	wordcount += s.split(" ").length;
	    }
	    
	    return wordcount;
		
	}
	
	void toRead() throws FileNotFoundException{
		
		Scanner file1 = new Scanner(new File("Liverpool.txt"));//this is for reading the first file
		ArrayList<String> list1 = new ArrayList<String>();
		        
		while (file1.hasNextLine())
			list1.add(file1.nextLine());
		        
		    
		System.out.println(list1);
		        
		Scanner myScanner2 = new Scanner(new File("Lakers.txt"));//this is for reading the second file
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		while (myScanner2.hasNextLine())
			list2.add(myScanner2.nextLine());

		System.out.println(list2);
		
	}
	
	int Common() throws FileNotFoundException {
		Scanner file1 = new Scanner(new File("Liverpool.txt"));//this is for reading the first file
		ArrayList<String> list1 = new ArrayList<String>();
		        
		while (file1.hasNextLine())
			list1.add(file1.nextLine());
		        
		    
		//System.out.println(list1);
		        
		Scanner myScanner2 = new Scanner(new File("Lakers.txt"));//this is for reading the second file
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		while (myScanner2.hasNextLine())
			list2.add(myScanner2.nextLine());

		//System.out.println(list2);
		
		list1.retainAll(list2);
		
		System.out.println(list1);
		//System.out.println(list2);
		
		int wordcount = 0;
	    for(String s:list1) {         
	    	wordcount += s.split(" ").length;
	    }
	    
	    return wordcount;
	}
        
        
	
	void Uncommon() throws FileNotFoundException {
		Scanner input = new Scanner(new File("Liverpool.txt"));
        Scanner scan = new Scanner(new File("Lakers.txt"));

        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();

        while (input.hasNext()) {
            list1.add(input.next());
        }

        while (scan.hasNext()) {
            list2.add(scan.next());
        }

        // iterate over list 1
        for (int i = list1.size() - 1; i >= 0; i--) {
            // if there is a occurence of two identical strings
            if (list2.contains(list1.get(i))) {
                // remove the String from list 2
                list2.remove(list2.indexOf(list1.get(i)));
                // remove the String from list 1
                list1.remove(i);
            }
        }

        // merge the lists
        list1.addAll(list2);

        // remove full stops
        for (int i = 0; i < list1.size(); i++) {
            list1.set(i, list1.get(i).replace(".", ""));
        }
        System.out.println("Unique Values: " + list1);
        //System.out.println("\nSimilar Values: " + list2);
    }
	
	void Remove () throws IOException {
		// PrintWriter object for output.txt
        PrintWriter pw = new PrintWriter("Lakers.txt");
          
        // BufferedReader object for input.txt
        BufferedReader br1 = new BufferedReader(new FileReader("Liverpool.txt"));
          
        String line1 = br1.readLine();
          
        // loop for each line of input.txt
        while(line1 != null)
        {
            boolean flag = false;
              
            // BufferedReader object for delete.txt
            BufferedReader br2 = new BufferedReader(new FileReader("StopWords.txt"));
              
            String line2 = br2.readLine();
              
            // loop for each line of delete.txt
            while(line2 != null)
            {
                if(line1.equals(line2))
                {
                    flag = true;
                    break;
                }
                  
                line2 = br2.readLine();
            }
              
            // if flag = false
            // write line of input.txt to output.txt
            if(!flag)
                pw.println(line1);
              
            line1 = br1.readLine();
              
        }
          
        pw.flush();
          
        // closing resources
        br1.close();
        pw.close();
          
        System.out.println("File operation performed successfully");
    }

	
	void Overlap() throws FileNotFoundException {
		int check;
		check = Common();
		
		System.out.println(check);
		
		if (check >= 5) {
			System.out.println("These files are similar");
		}
		else {
			System.out.println("These files are not similar");
		}
			
	}
	
	void MostCommon() throws FileNotFoundException {
		Scanner file1 = new Scanner(new File("Liverpool.txt"));//this is for reading the first file
		ArrayList<String> list1 = new ArrayList<String>();
		        
		while (file1.hasNextLine())
			list1.add(file1.nextLine());
		        
		Scanner myScanner2 = new Scanner(new File("Lakers.txt"));//this is for reading the second file
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		while (myScanner2.hasNextLine())
			list2.add(myScanner2.nextLine());
		
		list1.addAll(list2);
		
		System.out.println(list1);
		
		
	}
	
	void Sort() {
		
	}
	
	void Save() {
		String directory = System.getProperty("user.home");
		String fileName = "Playstation.txt";
		String absolutePath = directory + File.separator + fileName;

		// Write the content in file 
		try(FileWriter fileWriter = new FileWriter(absolutePath)) {
		    String fileContent = "This is a sample text.";
		    fileWriter.write(fileContent);
		    fileWriter.close();
		} catch (IOException e) {
		    // Cxception handling
		}

		// Read the content from file
		try(FileReader fileReader = new FileReader(absolutePath)) {
		    int ch = fileReader.read();
		    while(ch != -1) {
		        System.out.print((char)ch);
		        fileReader.close();
		    }
		} catch (FileNotFoundException e) {
		    // Exception handling
		} catch (IOException e) {
		    // Exception handling
		}
	}
	
	void Add()  {
		try {
		    Files.write(Paths.get("StopWords.txt"), "the text".getBytes(), StandardOpenOption.APPEND);
		}catch (IOException e) {
		    //exception handling left as an exercise for the reader
		}
	}
	

}

