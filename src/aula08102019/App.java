package aula08102019;

public class App {
	public static void main(String[] args) {
		Livro l1 = new Livro("Senhor do Aneis", "bla bla ", "Ediouro");
		Livro l2 = new Livro("Dom Casmurro", "bla bla ", "Editora Moderna");
		Livro l3 = new Livro("Design Sprint", "bla bla ", "Google");
		
		l1.exibir();
		l2.exibir();
		l3.exibir();
	}
}
