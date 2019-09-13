package aula12092019b;
import java.util.ArrayList;

public class Heroi {
	private String identidadeSecreta;
	private String nome;
	private ArrayList<Poder> poderes = new ArrayList<>();
	
	public Heroi(String identidadeSecreta, String nome) {
		this.identidadeSecreta = identidadeSecreta;
		this.nome = nome;
	}
	
	public void addPoder(Poder poder) {
		poderes.add(poder);
	}
	
	public void usarPoder() {
		for (Poder p : poderes) {
			if (p.disponivel) {
				p.ativar();
			}
		}
	}
}
