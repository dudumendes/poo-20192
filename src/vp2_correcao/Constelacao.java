package vp2_correcao;

import java.util.ArrayList;

public class Constelacao {
	public String nome;
	public ArrayList<Estrela> estrelas = new ArrayList<>();
	
	
	public void adicionarEstrela(Estrela estrela) {
		estrelas.add(estrela);
	}
	
	public Estrela recuperarMaiorEstrela() {
		Estrela maior = null;
		
		if (estrelas == null) {
			maior = estrelas.get(0);
			
			for (Estrela e: estrelas) {
				if (e.getGrandeza() > maior.getGrandeza()) {
					maior = e;
				}
			}
		}
		
		return maior;
	}
}
