package aula20082019;

public class Cerveja {
	String marca;
	double teorAlcoolico;
	String tipo;
	
	public Cerveja() {
		
	}
	
	public void exibir() {
		System.out.println("Marca: " + marca 
				+ "\nTeor Alcoolico: " + teorAlcoolico
				+ "\nTipo: " + tipo);
	}
}
