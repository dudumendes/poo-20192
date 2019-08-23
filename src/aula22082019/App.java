package aula22082019;

public class App {
	public static void main(String[] args) {
		int a = 345;
		
		Exemplo ex = new Exemplo();
		
		ex.processNumber(a);
		
		System.out.println(a);
		
		a = ex.processNumber(a, 40);
		System.out.println(a);
		
		Person p = new Person();
		p.name = "Eduardo";
		
		ex.changeName(p);
		System.out.println(p.name.toUpperCase());
		
	}
}
