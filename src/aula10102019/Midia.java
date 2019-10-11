package aula10102019;

public abstract class Midia {
	String nome;
	
	public Midia(String nome) {
		this.nome = nome;
	}
	
	public void exibir() {
		System.out.println("Nome: " + nome);
	}
	
	public abstract void foo();
}
