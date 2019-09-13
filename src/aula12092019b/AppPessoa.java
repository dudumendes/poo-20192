package aula12092019b;

import java.util.ArrayList;

public class AppPessoa {
	public static void main(String[] args) {
		ArrayList<Pessoa> agenda = new ArrayList<>();
		
		agenda.add(new Pessoa("Eduardo", "Mendes"));
		
		Pessoa p1 = new Pessoa("João Pedro", "Frutuoso");
		agenda.add(p1);
		
		agenda.add(new Pessoa("Gabriel", "Marreiro"));
		
		for (Pessoa p: agenda) {
			System.out.println(p.getNome() + " " + p.getSobrenome());
		}
 		
	}
}
