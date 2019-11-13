package aula07112019;

import java.util.concurrent.TimeoutException;

public class CanavaralCabe {
	public static void main(String[] args) {
		Rocket poo1 = new Rocket();
		
		try {
			System.out.println("Entrou no try");
			poo1.launch(1900);
			System.out.println("It seems okay...");
			
		} catch(HighTemperatureException | TimeoutException e) {
			System.out.println(e.getMessage());
			
		} finally {
			System.out.println("Entrou no finally");
		}

	}
}
