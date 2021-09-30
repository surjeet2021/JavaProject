package sampletProject.sampleTest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args) {
		try {
		      File myObj = new File("C:\\work\\filename.txt");
		      
		      
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		      
		      FileWriter myWriter = new FileWriter("C:\\work\\filename.txt");
		      myWriter.write("Files in Java might be tricky, but it is fun enough!");
		      myWriter.close();
		      
//		      File myObj = new File("filename.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		      
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

	}

}
