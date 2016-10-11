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
		System.out.println("����� ������: " + threadInstance);
		threadInstance.start();
	}
	
	public void run() {
		try {
			Sensor sensorInstance = new Sensor();	//	����, �� ���������� � �������� ������
			temperature = sensorInstance.getTemperature();	//	����������� �� ������
			System.out.println("����������� ������ " + threadName + " = " + temperature);
			Thread.sleep(sensorInstance.getDelay());	//	�������� �� ���������
			Writer writerInstance = new Writer();
			System.out.println("����������� ��� ����� = " + temperature);
			writerInstance.write(generationIndex + "\t" + sensorIndex + "\t" + temperature + "\n");
		} catch (InterruptedException e) {
			System.out.println(threadName + " ���������� " + e);
		} catch (Exception e) {
			System.out.println(threadName + " � �������� " + e);
		}
		System.out.println(threadName + " ���������.");
	}
}
