package aula27082019;

public class Pato {
	String nome;
	TipoDeVoo tipoDeVoo;
	
	public Pato(String nome, TipoDeVoo tipoDeVoo) {
		this.nome = nome;
		this.tipoDeVoo = tipoDeVoo;
	}
	
	public void voar() {
		tipoDeVoo.executar(nome);
	}
}
