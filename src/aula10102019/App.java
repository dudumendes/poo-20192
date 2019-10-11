package aula10102019;

public class App {
	public static void main(String[] args) {
		Midia l1 = new Livro("Senhor do Aneis", "bla bla ", "Ediouro");
		Midia l2 = new Livro("Dom Casmurro", "bla bla ", "Editora Moderna");
		Midia l3 = new Livro("Design Sprint", "bla bla ", "Google");
		
		//Midia m1 = new Midia("Midia 1");
		
		l1.exibir();
		l2.exibir();
		l3.exibir();
	}
}
