package TemperatureCalculation;

public class ThreadGeneration implements Runnable {
	
	private String threadName;
	private int generationIndex;
	
	ThreadGeneration (int generationIndex) {
		this.generationIndex = generationIndex;
		threadName = String.valueOf(generationIndex);
		Thread threadInstance = new Thread(this, threadName);
		try {
			threadInstance.start();
			threadInstance.join();
		} catch (InterruptedException e) {
			System.out.println("Потоки проби " + generationIndex + " перервано.");
		}
	}
	
	public void run() {
		for (int index = 1; index < 101; index++) {
			try {
				ThreadGenerator threadGeneratorInstance = new ThreadGenerator(index, generationIndex);
			} catch (Exception e) {
				System.out.println("Помилка із сенсором " + (index));
			}
		}
	}
}
