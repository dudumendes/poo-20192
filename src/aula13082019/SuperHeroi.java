package aula13082019;

public class SuperHeroi extends Heroi {
	String poder;
	
	public SuperHeroi(String nome, String identidadeSecreta, String poder) {
		super(nome, identidadeSecreta);
		this.poder = poder;
	}
	
	public void usarPoder() {
		System.out.println("Usando o poder: " + this.poder);
	}
}
