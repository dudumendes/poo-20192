package aula07112019;

public class Rocket {
	
	public void launch(double temperature) throws HighTemperatureException {
		if (temperature > 1000) {
			throw new HighTemperatureException(temperature);
		}
		
		System.out.print("Okay houston.");
	}
}
