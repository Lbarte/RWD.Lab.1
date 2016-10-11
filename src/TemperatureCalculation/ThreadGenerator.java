package TemperatureCalculation;

public class ThreadGenerator implements Runnable {

	private String threadName;
	private int sensorIndex;
	private int generationIndex;
	private int temperature;
	
	ThreadGenerator (int sensorIndex, int generationIndex) {
		this.sensorIndex = sensorIndex;
		this.generationIndex = generationIndex;
		threadName = String.valueOf(sensorIndex);
		Thread threadInstance = new Thread(this, threadName);
		System.out.println("Новий сенсор: " + threadInstance);
		threadInstance.start();
	}
	
	public void run() {
		try {
			Sensor sensorInstance = new Sensor();	//	клас, що генерується в окремому потоці
			temperature = sensorInstance.getTemperature();	//	температура від давача
			System.out.println("Температура давача " + threadName + " = " + temperature);
			Thread.sleep(sensorInstance.getDelay());	//	затримка на провіднику
			Writer writerInstance = new Writer();
			System.out.println("Температура при записі = " + temperature);
			writerInstance.write(generationIndex + "\t" + sensorIndex + "\t" + temperature + "\n");
		} catch (InterruptedException e) {
			System.out.println(threadName + " перерваний " + e);
		} catch (Exception e) {
			System.out.println(threadName + " з помилкою " + e);
		}
		System.out.println(threadName + " завершено.");
	}
}
