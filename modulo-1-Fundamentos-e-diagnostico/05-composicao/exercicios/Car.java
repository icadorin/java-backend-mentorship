public class Car {

	private Engine engine;

	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public void start() {
		this.engine.startEngine();
	}

	public void turnOff() {
		this.engine.turnOffEngine();
	}

	public boolean getStatus() {
		return this.engine.getEngineStatus();
	}
}