package aula10102019;

public abstract class DocumentoTextual extends Midia {
	String texto;
	
	public DocumentoTextual(String nome, String texto) {
		super(nome);
		this.texto = texto;
	}
	
	public void exibir() {
		super.exibir();
		System.out.println("Texto: " + texto);
	}
	
}
