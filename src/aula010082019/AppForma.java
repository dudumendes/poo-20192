package aula010082019;

public class AppForma {
	public static void main(String[] args) {
		Forma f1 = new Forma();
		f1.rodar();
		f1.tocarSom();
		
		Quadrado q1 = new Quadrado();
		q1.rodar();
		q1.tocarSom();
		
		
		Ameba a1 = new Ameba();
		a1.rodar();
		a1.tocarSom();
		
		Forma f2 = new Ameba();
		f2.rodar();
		f2.tocarSom();
	}
}
