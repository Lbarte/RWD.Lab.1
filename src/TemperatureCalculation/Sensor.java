package TemperatureCalculation;

import java.util.Random;

//Давач
public class Sensor {

	private Random randomInstance = new Random();
	
	protected final int getTemperature() {
		return randomInstance.nextInt(50) - 10;
	}
	
	protected final int getDelay() {
		return randomInstance.nextInt(9)+1;
	}
}
