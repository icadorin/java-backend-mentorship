public class Animal {
	
	private String name;
	private int age;

	public Animal(String name, int age) {
		checkName(name);
		checkAge(age);
	}

	public void eat() {
		System.out.println("comendo");
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		checkName(name);
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		checkAge(age);
	}

	private void checkName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("Nome inválido");
		}

		this.name = name;
	}

	private void checkAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Idade não pode ser negativa.");
		}

		this.age = age;
	}
}