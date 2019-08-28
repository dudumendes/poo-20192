package aula27082019;

public class Heroi {
	String identidadeSecreta;
	String nome;
	Poder poder;
	
	public Heroi(String identidadeSecreta, String nome, Poder poder) {
		this.identidadeSecreta = identidadeSecreta;
		this.nome = nome;
		this.poder = poder;
	}
	
	public void usarPoder() {
		poder.ativar();
	}
}
