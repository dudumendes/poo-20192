package aula13082019;

public class Cachorro {
	int tamanho;
	String nome;
	String raca;
	
	public Cachorro(int tamanho, String nome , String raca) {
		this.tamanho = tamanho;
		this.nome = nome;
		this.raca = raca;
	}
	
	public void latir() {
		System.out.println(nome + " diz au au");
	}
}
