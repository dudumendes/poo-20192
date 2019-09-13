package aula12092019;
import java.util.ArrayList;

public class Heroi {
	String identidadeSecreta;
	String nome;
	ArrayList<Poder> poderes = new ArrayList<>();
	
	public Heroi(String identidadeSecreta, String nome) {
		this.identidadeSecreta = identidadeSecreta;
		this.nome = nome;
	}
	
	public void usarPoder() {
		for (Poder p : poderes) {
			if (p.disponivel) {
				p.ativar();
			}
		}
	}
}
