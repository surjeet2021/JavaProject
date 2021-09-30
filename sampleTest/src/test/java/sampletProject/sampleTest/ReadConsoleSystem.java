package sampletProject.sampleTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadConsoleSystem {

	public static void main(String[] args) {
	
		System.out.println("Enter your name here");
		
		
		String s;
		try {
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			s = bufferRead.readLine();
			System.out.println("Your name is :"+s);
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		System.out.println("Enter your name here");
		
		Scanner scanInputValue=new Scanner(System.in);
		
		String valueIs=scanInputValue.nextLine();
		scanInputValue.close();
		System.out.println("Your name is "+valueIs);
		

	}

}
