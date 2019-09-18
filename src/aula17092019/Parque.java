package aula17092019;
import java.util.ArrayList;

public class Parque {
	String nome;
	String estado;
	String anoDeCriacao;
	ArrayList<AtracaoTuristica> atracoes;

	public Parque() {
		this.atracoes = new ArrayList<>();
	}
	
	public Parque(String nome,
				  String estado,
				  String anoDeCriacao) {
		this();
		this.nome = nome;
		this.estado = estado;
		this.anoDeCriacao = anoDeCriacao;
	}
	
	public boolean cadastrarAtracao(AtracaoTuristica atracao) {
		if (atracao == null) {
			return false;
		} else {
			this.atracoes.add(atracao);
			return true;
		}
	} 
	
	public void listarAtracoes() {
		System.out.println(this.nome);
		
//		for (AtracaoTuristica at : this.atracoes) {
//			at.exibir();
//		}
//		
		this.atracoes.forEach(at -> at.exibir());
	}
}
