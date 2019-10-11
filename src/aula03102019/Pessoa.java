package aula03102019;

public class Pessoa {
	private String nome;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Pessoa) {
			Pessoa p = (Pessoa) obj;
			
			return this.nome.equals(p.nome);
			
		} else {
			return false;
		}
	}
}
