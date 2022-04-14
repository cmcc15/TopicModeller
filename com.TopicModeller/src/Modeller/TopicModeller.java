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
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class TopicModeller {
	/*
	 * This is a class that contains a series of different methods
	 * These methods are used to carry out different checks on two separate documents
	 */
	
	int doc1Wordcount() throws FileNotFoundException{
		//this method is for count the amount of words in the first document
		
		Scanner doc1 = new Scanner(new File("ChampionsLeague.txt"));//this is for reading the first document
		ArrayList<String> list1 = new ArrayList<String>();
		        
		while (doc1.hasNextLine())
			list1.add(doc1.nextLine());
		
		int wordcount1 = 0;
	    for(String s:list1) {         
	    	wordcount1 += s.split(" ").length;
	    }    //to get word count
	    
	    return wordcount1;
	
	
	}//end file1Wordcount
	
	public int doc2Wordcount() throws IOException{
		//this method is for count the amount of words in the second document
		
		Scanner doc2 = new Scanner(new File("PremierLeague.txt"));//this is for reading the second document
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		while (doc2.hasNextLine())
			list2.add(doc2.nextLine());

		//System.out.println(list);
		
		int wordcount2 = 0;
	    for(String s:list2) {         
	    	wordcount2 += s.split(" ").length;
	    } //to get word count
		
	    return wordcount2;
		
	}//end file2Wordcount
	
	void toRead() throws FileNotFoundException{
		
		Scanner file1 = new Scanner(new File("ChampionsLeague.txt"));//this is for reading the first document
		ArrayList<String> list1 = new ArrayList<String>();
		        
		while (file1.hasNextLine())
			list1.add(file1.nextLine());
		        
		    
		System.out.println(list1);//to read contents of the first document
		        
		Scanner myScanner2 = new Scanner(new File("PremierLeague.txt"));//this is for reading the second document
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		while (myScanner2.hasNextLine())
			list2.add(myScanner2.nextLine());

		System.out.println(list2);//to read contents of the second document
		
	}//end toRead
	
	void toReadStop() throws FileNotFoundException{
		//list of stop words at https://github.com/igorbrigadir/stopwords/blob/master/en/terrier.txt 
		
		Scanner file1 = new Scanner(new File("StopWords.txt"));//this is for reading the Stop Words
		ArrayList<String> list1 = new ArrayList<String>();
		        
		while (file1.hasNextLine())
			list1.add(file1.nextLine());
		        
		System.out.println(list1);//to print the stop Words
	}//end toReadStop
	
	int Common() throws FileNotFoundException {
		//to gets the contents of the two documents that match
		
		Scanner file1 = new Scanner(new File("ChampionsLeague.txt"));
		ArrayList<String> list1 = new ArrayList<String>();
		        
		while (file1.hasNextLine())
			list1.add(file1.nextLine());
		        
		Scanner myScanner2 = new Scanner(new File("PremierLeague.txt"));
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		while (myScanner2.hasNextLine())
			list2.add(myScanner2.nextLine());
		
		list1.retainAll(list2);
		
		System.out.println(list1);
		
		int wordcount = 0;
	    for(String s:list1) {         
	    	wordcount += s.split(" ").length;
	    }
	    
	    return wordcount;
	}//end Common
        
        
	
	void Uncommon() throws FileNotFoundException {
		//to get the uncommon words from the two documents
		
		Scanner input = new Scanner(new File("ChampionsLeague.txt"));
        Scanner scan = new Scanner(new File("PremierLeague.txt"));

        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();

        while (input.hasNext()) {
            list1.add(input.next());
        }//end while

        while (scan.hasNext()) {
            list2.add(scan.next());
        }//end while

        //used to get the words that do not match 
        for (int i = list1.size() - 1; i >= 0; i--) {
            if (list2.contains(list1.get(i))) {
                list2.remove(list2.indexOf(list1.get(i)));
                list1.remove(i);
            }
        }

        // merge the two documents
        list1.addAll(list2);

        // to remove full stops
        for (int i = 0; i < list1.size(); i++) {
            list1.set(i, list1.get(i).replace(".", ""));
        }
        System.out.println("Unique Values: " + list1);
    }
	
	void Similar() throws FileNotFoundException {
		//This method is for finding out if the documents are about a similar topic
		Scanner doc1 = new Scanner(new File("ChampionsLeague.txt"));//this is for reading the first document
		ArrayList<String> list1 = new ArrayList<String>();
		        
		while (doc1.hasNextLine())
			list1.add(doc1.nextLine());
		
		int wordcount1 = 0;
	    for(String s:list1) {         
	    	wordcount1 += s.split(" ").length;
	    }    //to get word count
	    
	    Scanner doc2 = new Scanner(new File("PremierLeague.txt"));//this is for reading the second document
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		while (doc2.hasNextLine())
			list2.add(doc2.nextLine());

		//System.out.println(list);
		
		int wordcount2 = 0;
	    for(String s:list2) {         
	    	wordcount2 += s.split(" ").length;
	    } //to get word count
	   
		Scanner file1 = new Scanner(new File("ChampionsLeague.txt"));
	  	ArrayList<String> list3 = new ArrayList<String>();
	  		        
	  	while (file1.hasNextLine())
	  		list3.add(file1.nextLine());
	  		        
	  	Scanner myScanner2 = new Scanner(new File("PremierLeague.txt"));
	  		
	  	ArrayList<String> list4 = new ArrayList<String>();
	  		
	  	while (myScanner2.hasNextLine())
	  		list4.add(myScanner2.nextLine());
	  		
	  	list3.retainAll(list4);
	  		
	  	int wordcount = 0;
	  	for(String s:list3) {
	  		wordcount += s.split(" ").length;
	  	}
	  	
	  	if (wordcount>=wordcount1+wordcount2) {
	  		System.out.println("These documents are about a similar topic");
	  	}
	  	else {
	  		System.out.println("These documents are not about a similar topic");
	  	}
	    
		
	}
	
	void Remove () throws IOException {
		//to remove stop words from the documents 
        PrintWriter pw = new PrintWriter("PremierLeague.txt");
          
        BufferedReader br1 = new BufferedReader(new FileReader("ChampionsLeague.txt"));
          
        String line1 = br1.readLine();
          
        while(line1 != null)
        {
            boolean flag = false;
              
            BufferedReader br2 = new BufferedReader(new FileReader("StopWords.txt"));
              
            String line2 = br2.readLine();
              
            while(line2 != null)
            {
                if(line1.equals(line2))
                {
                    flag = true;
                    break;
                }//end if 
                  
                line2 = br2.readLine();
            }//end while
              
            if(!flag)
                pw.println(line1);
              
            line1 = br1.readLine();
              
        }//end while
          
        pw.flush();
          
        // closing resources
        br1.close();
        pw.close();
          
        System.out.println("File operation was successful");
    }//end Remove 

	
	void Overlap() throws FileNotFoundException {
		//to check for overlapping words
		int check;
		check = Common();
		
		System.out.println(check);
		
		if (check >= 5) {
			System.out.println("These files are similar");
		}//end if 
		else {
			System.out.println("These files are not similar");
		}//end else 
			
	}//end Overlap
	
	void MostCommon() throws FileNotFoundException {
		//to find the most common words from the two documents
		Scanner file1 = new Scanner(new File("ChampionsLeague.txt"));
		ArrayList<String> list1 = new ArrayList<String>();
		        
		while (file1.hasNextLine())
			list1.add(file1.nextLine());
		        
		Scanner myScanner2 = new Scanner(new File("PremierLeague.txt"));
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		while (myScanner2.hasNextLine())
			list2.add(myScanner2.nextLine());
		
		list1.addAll(list2);
		
		System.out.println(list1);
		
	}
	
	void Sort() throws IOException {
		//sort the document
		
		//sorts Alphabetically     
		String inputFile = "PremierLeague.txt";
		String outputFile = "PremierLeague.txt";

		FileReader fileReader = new FileReader(inputFile);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String inputLine;
		List<String> lineList = new ArrayList<String>();
		while ((inputLine = bufferedReader.readLine()) != null) {
			lineList.add(inputLine);
		}
		fileReader.close();

		Collections.sort(lineList);

		FileWriter fileWriter = new FileWriter(outputFile);
		PrintWriter out = new PrintWriter(fileWriter);
		for (String outputLine : lineList) {
			out.println(outputLine);
		}
		out.flush();
		out.close();
		fileWriter.close();
		
	}//end Sort
	
	
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
		    // Exception handling
		}

		// Read the content from file
		try(FileReader fileReader = new FileReader(absolutePath)) {
		    int read = fileReader.read();
		    while(read != -1) {
		        System.out.print((char)read);
		        fileReader.close();
		    }//end while
		} catch (FileNotFoundException e) {
		    
		} catch (IOException e) {
			
		}
	}//end Save
	
	void Add()  {
		//to add to StopWords
		try {
		    Files.write(Paths.get("StopWords.txt"), "the text".getBytes(), StandardOpenOption.APPEND);
		}catch (IOException e) {
		    //exception handling left as an exercise for the reader
		}
	}//end Add
	

}//end TopicModeller
