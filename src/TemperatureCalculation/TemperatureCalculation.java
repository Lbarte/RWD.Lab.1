package TemperatureCalculation;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TemperatureCalculation {

	TemperatureCalculation(int numberOfSamples) throws FileNotFoundException {
		PrintWriter printWriterInstance = new PrintWriter("test.txt");
		printWriterInstance.write("");
		printWriterInstance.close();
		
		Writer writerInstance = new Writer();
		writerInstance.write("Sample\tSensor\tTemperature\n");
		
		for (int beforeIndex = 1; beforeIndex < numberOfSamples+1; beforeIndex++) {
			ThreadGeneration threadGenerationInstance = new ThreadGeneration(beforeIndex);
		}
		
		System.out.println("Завершено.");
	}
}
