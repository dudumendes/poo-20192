package aula07112019;

public class CanavaralCabe {
	public static void main(String[] args) {
		Rocket poo1 = new Rocket();
		try {
			poo1.launch(1220);
			System.out.print("It seems okay...");
			
		} catch(HighTemperatureException e) {
			System.out.println(e.getMessage());
		}

	}
}
