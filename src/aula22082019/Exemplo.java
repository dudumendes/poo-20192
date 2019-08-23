package aula22082019;

public class Exemplo {
	
	public void processNumber(int x) {
		x = x * 10;
		System.out.println("O valor de x eh: " + x);
	}
	
	public int processNumber(int x, int y) {
		return x * y;
	}
	
	public void changeName(Person person) {
		person.name += " ++++";
	}

}
