package sampletProject.sampleTest;

public class DynamicPolymorphism extends ABC {
	
	 public void myMethod(){
			System.out.println("Overridden Method");
		}
	 

	public static void main(String[] args) {
	
		ABC obj = new DynamicPolymorphism();
		
		obj.myMethod();
		 
		
	}

}
