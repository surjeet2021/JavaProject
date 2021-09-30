package sampletProject.sampleTest;

public class Polymorphism {

	public static void main(String[] args) {
	
		Animal myAnimal = new Animal();
		Cat myCat= new Cat();
		Dog myDog = new Dog();
		
		myAnimal.animalsound();
		myCat.animalSound();
		myDog.animalSound();
		
		
	}

}
