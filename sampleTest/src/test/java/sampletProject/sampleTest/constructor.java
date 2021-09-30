package sampletProject.sampleTest;


class Calc{
	int numb1;
	int numb2;
	int numb3;
	
	public Calc() {
		numb1=5;
		numb2=6;
	}
	
	public Calc(int n) {
		numb1=n;
		
	}
	
}



public class constructor {
	
//	same as class name
//	Does not return value
//  Will be called automatically when object created

	public static void main(String[] args) {
		
		
		Calc obj1 = new Calc();
		System.out.println(obj1.numb1);
		
		System.out.println(obj1.numb2);
		
		Calc obj2 = new Calc(20);
		System.out.println(obj2.numb1);		
	

	}

}
