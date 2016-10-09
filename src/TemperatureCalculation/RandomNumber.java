package TemperatureCalculation;
import java.util.Random;

public class RandomNumber {

	private Random randomInstance = new Random();
	
	int getTemp () {
		int temp = randomInstance.nextInt(50) - 10;
		return temp==0?getTemp():temp;
	}
	
	int getDelay () {
		return randomInstance.nextInt(9)+1;
	}
}
