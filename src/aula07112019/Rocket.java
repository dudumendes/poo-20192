package aula07112019;

import java.util.concurrent.TimeoutException;

public class Rocket {
	
	public void launch(double temperature)
			throws HighTemperatureException, TimeoutException {
		
		try {
			System.out.println("alocando recurso...");
			prepare(temperature / 3);
		} finally {
			System.out.println("desalocando recurso...");
		}
		
		if (temperature > 1000) {
			throw new HighTemperatureException(temperature);
		}
		
		System.out.print("Okay houston.");
	}
	
	public void prepare(double time) throws TimeoutException {
		
		System.out.println("Preparing launch");
		
		if (time > 300) {
			throw new TimeoutException();
		}
		
	}
}
