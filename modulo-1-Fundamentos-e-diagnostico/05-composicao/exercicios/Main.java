public class Main {
	public static void main(String[] args) {

		Engine engine = new Engine();
		Car car = new Car(engine);

		car.start();
		System.out.println(car.getStatus());
		car.turnOff();
		System.out.println(car.getStatus());

	}
}