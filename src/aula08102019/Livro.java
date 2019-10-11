package aula08102019;

public class Livro extends DocumentoTextual {
	String editora;
	
	public Livro(String nome, String texto, String editora) {
		super(nome, texto);
		this.editora = editora;
	}
	
	public void exibir() {
		System.out.println("=========");
		super.exibir();
		System.out.println("Editora: " + editora);
	}
}
