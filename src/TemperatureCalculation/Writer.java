package TemperatureCalculation;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {

	synchronized void write(String line) {
		try (FileWriter fileWriterInstance = new FileWriter("test.txt", true)) {
			fileWriterInstance.write(line);
		} catch (IOException e) {
			System.out.println("Помилка запису в файл - " + line);
		} catch (Exception e) {
			System.out.println("Помилка при записі файлу - " + line);
		}
	}
}