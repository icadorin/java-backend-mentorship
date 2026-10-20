public class Main {
	public static void main(String[] args) {

		Dog dog = new Dog("Tobby", -1);

		// dog.setName("Tobby");
		// dog.setAge(4);

		System.out.println(dog.getName());
		System.out.println(dog.getAge());

		dog.eat();
		dog.bark();
	}
}