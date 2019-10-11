package aula03102019;

public class EqualsTest {
	public static void main(String[] args) {
		int x = 3;
		byte y = 3;
		long z = 3;
		Integer w = 3;
		
		String a = "Eduardo Mendes";
		String b = "Eduardo Mendes";
		String c = "Eduardo Mendes";
		String d = "Eduardo Mendes";
		
		System.out.println("x == y: " + (x == y));
		System.out.println("x == z: " + (x == z));
		System.out.println("x == w: " + (x == w));
		System.out.println("y == z: " + (y == z));
		System.out.println("a == b: " + (a == b));
		System.out.println("a == c: " + (a == c));
		System.out.println("a == d: " + (a == d));
		System.out.println("c == b: " + (c == b));
		System.out.println("a equals b: " + (a.equals(b)));
		System.out.println("a equals c: " + (a.equals(c)));
		
	}
}
