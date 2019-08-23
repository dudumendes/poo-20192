package aula22082019;

public class Avaliador {
	String nome;
	String tipo;
	double cache;
	
	public Avaliador(String nome, String tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	public Avaliador(String nome, String tipo, double cache) {
		this.nome = nome;
		this.tipo = tipo;
		this.cache = cache;
	}
	
	public Avaliador(String tipo, double cache) {
		this.nome = "";
		this.tipo = tipo;
		this.cache = cache;
	}
	
	public Avaliador avaliadorAnonimo(String tipo, double cache) {
		return new Avaliador(tipo, cache);
	}
	
	public Avaliador avaliadorConvidado(String nome, String tipo, double cache) {
		return new Avaliador(nome, tipo, cache);
	}
}
