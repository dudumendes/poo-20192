package aula13082019;

public class AppHeroi {
	public static void main(String[] args) {
		Heroi h1 = new Heroi("Super-Homem", "Clark Kent");
		Heroi h2 = new Heroi("Homem de Ferro", "Tony Stark");
		
		SuperHeroi sh1 = new SuperHeroi("Fenix", "Jean Grey", "Tudo");
		SuperHeroi sh2 = new SuperHeroi("Batman", "Bruce Wayner", "Muito Dinheiro");
		
		h1.exibir();
		h2.exibir();
		
		sh1.exibir();
		sh1.usarPoder();
		
		sh2.exibir();
		sh2.usarPoder();
	}
}
