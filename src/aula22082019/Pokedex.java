package aula22082019;

public class Pokedex {
	public static void main(String args[]) {
		Pokemon p1 = new Pokemon(
				"Charmander", "Fogo", "Lanca-Chamas", 10, 30, 90);
		
		Pokemon p2 = new Pokemon(
				"Bubassaur", "Planta", "Chicote", 30, 45, 120);
				
		p1.atacar();
		p2.atacar();
	}
}
