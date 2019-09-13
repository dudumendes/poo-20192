package aula12092019;

public class Poder {
	String onomatopeia;
	boolean disponivel = false;
	
	public Poder(String onomatopeia, boolean disponivel) {
		this.onomatopeia = onomatopeia;
		this.disponivel = disponivel;
	}
	
	public void ativar(){
		System.out.println(onomatopeia);
	}
}
