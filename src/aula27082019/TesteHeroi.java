package aula27082019;

public class TesteHeroi {
	public static void main(String[] args) {
		Poder poder = new Poder("Hadouken");
		Heroi h1 = new Heroi("Ryu", "Ryu", poder);
		
		Heroi h2 = new Heroi("Bruce Wayne", "Batman", new Poder("Muito Dinheiro"));
		
		h1.usarPoder();
		h2.usarPoder();
		
		Heroi h3 = new Heroi("Clark Kent", "Super Homem", new SuperForca());
		
		Poder poder2 = new Invisibilidade();
		Heroi h4 = new Heroi("Sara", "Mulher Invisivel", poder2);
		
		h3.usarPoder();
		h4.usarPoder();
		
	}
}
