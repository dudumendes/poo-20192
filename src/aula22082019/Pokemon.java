package aula22082019;

public class Pokemon {
	String nome, tipo, habilidade;
	int ataque, defesa, cp;
	
	
	public Pokemon(String nome,
				   String tipo, 
				   String habilidade,
				   int ataque, int defesa, int cp) {
		this.nome = nome;
		this.tipo = tipo;
		this.habilidade = habilidade;
		this.ataque = ataque;
		this.defesa = defesa;
		this.cp = cp;
	}
	
	public void atacar() {
		int totalDano = ataque - defesa;
		System.out.println("Atacando com: " + habilidade);
		System.out.println("Todal do dano: " + (cp - totalDano));
	}
	
}
