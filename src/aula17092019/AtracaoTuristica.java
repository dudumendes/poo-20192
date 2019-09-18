package aula17092019;

public class AtracaoTuristica {
	String nome;
	String descricao;
	
	public AtracaoTuristica(String nome) {
		this.nome = nome;
	}

	public void exibir() {
		System.out.println("- " + this.nome);
		System.out.println("\n");

	}
}
