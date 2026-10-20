public class Dog extends Animal {

	public Dog(String name, int age) {
		super(name, age);		 
	}

	public Dog(String name) {
		super(name, 0);
	}
	
	public void bark() {
		System.out.println("Au Au");
	}
}