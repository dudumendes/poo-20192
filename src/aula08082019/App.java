package aula08082019;

public class App {
	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro();
		Cachorro c2 = new Cachorro();
		
		c1.nome = "Rex";
		c2.nome = "Apolo";
		
		c1.latir();
		c2.latir();
		
	}
}
