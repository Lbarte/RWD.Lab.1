package TemperatureCalculation;
	//Давач
public class Sensor {

	private RandomNumber randNumberInstance = new RandomNumber();
	
	protected final int getTemperature() {
		return randNumberInstance.getTemp();
	}
	
	protected final int getDelay() {
		return randNumberInstance.getDelay();
	}
}
