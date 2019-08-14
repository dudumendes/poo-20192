package aula06082019;

public class Loopy {
	
	public static void main(String[] args) {
		int x = 0;
		
		System.out.println("Antes do loop");
		
		while (x < 4) {
			System.out.println("Dentro do loop");
			
			System.out.println("O valor de x eh: " + x);
			
			x++;
		}
		
		System.out.println("Fora do loop");
	}

}
