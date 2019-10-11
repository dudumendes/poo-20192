package aula03102019;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Eduardo Mendes");
		Pessoa p2 = new Pessoa("Eduardo Mendes");
		
		System.out.println("p1 == p2: " + (p1 == p2));
		System.out.println("p1 equals p2: " + (p1.equals(p2)));
	}
}
