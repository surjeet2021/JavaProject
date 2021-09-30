package sampletProject.sampleTest;

import java.util.ArrayList;

//Elements can be added and removed from an ArrayList whenever we want
public class ArrayList1 {

	public static void main(String[] args) {
		
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("volvo");
		cars.add("BMW");
		cars.add("FORD");
		cars.add("Mazda");
		cars.add("Mercedis");
		
		System.out.println(cars);		
		System.out.println(cars.get(3));
		
		cars.set(3, "ALTO");
		cars.remove(0);
		System.out.println(cars);
		

	}

}


