package sampletProject.sampleTest;


import java.util.ArrayList;
import java.util.Collections;


public class MissingNumber {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(9);
	    numbers.add(6);
	    numbers.add(4);
	    numbers.add(5);
	    numbers.add(7);
	    numbers.add(0);
	    numbers.add(1);
	    Collections.sort(numbers);
	    
	    int i=1;
	    while(i< numbers.size())
//	    for(int i=1;i< numbers.size();i++)
	    {
	        if (numbers.get(i) - numbers.get(i-1) == 1) {
	        	

	        } else {
	            System.out.println("Missing number is " + (numbers.get(i-1) + 1));
	            numbers.add((numbers.get(i-1)+1));
	            Collections.sort(numbers);
	        }
	        i++;
	    }

	}

}
