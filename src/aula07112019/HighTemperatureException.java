package aula07112019;

public class HighTemperatureException extends Exception {
	
	public HighTemperatureException(double temperature) {
		super("The temperature is so high: " + temperature + "ºC");
	}

}
