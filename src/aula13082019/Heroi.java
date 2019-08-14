package aula13082019;

public class Heroi {
	String nome;
	String identidadeSecreta;
	
	public Heroi(String nome, String identidadeSecreta) {
		this.nome = nome;
		this.identidadeSecreta = identidadeSecreta;
	}
	
	public void exibir() {
		System.out.println("Heroi[" + nome + ", " + identidadeSecreta + "]");
	}
}
