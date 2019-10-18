package vp2_correcao;

public class Estrela {
	private String nome;
	private int gradenza;
	
	public Estrela() {}
	
	public Estrela (String nome, int grandeza) {
		this.nome = nome;
		this.gradenza = grandeza;
	}
	
	public void setNome(String nome) {
		if (nome != null && !nome.equals("")) {
			this.nome = nome;
		}
	}
	
	public void setGrandeza(int grandeza) {
		if (grandeza >= 0 && grandeza <= 8) {
			this.gradenza = grandeza;
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getGrandeza() {
		return this.gradenza;
	}
}
