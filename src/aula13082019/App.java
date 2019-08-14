package aula13082019;

public class App {
	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro(30, "Rex", "Pequinês");
		Cachorro c2 = new Cachorro(60, "Apolo", "Doberman");
		
		c1.nome = "Honey";
				
		c1.latir();
		c2.latir();
		
	}
}
