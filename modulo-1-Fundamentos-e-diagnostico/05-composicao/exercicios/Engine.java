public class Engine {
	
	private boolean engineStatus = false;

	public void startEngine() {
		this.engineStatus = true;
	}

	public void turnOffEngine() {
		this.engineStatus = false;
	}

	public boolean getEngineStatus() {
		return this.engineStatus;
	}
}