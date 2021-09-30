package sampletProject.sampleTest;

public class Encapsulation {

	public static void main(String[] args) {
		
		employee e = new employee();
		
		e.setID(12345);
		
		e.setName("Surjeet");
		
		e.setSalary(3000);
		
		
		System.out.println("Nam : "+e.getName());
		System.out.println("ID is : "+e.getID());
		System.out.println("Salary is "+e.getSalary());
		
		
		

	}

}
