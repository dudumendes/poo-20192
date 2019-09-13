package aula12092019;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("Eduardo");
		System.out.println(lista.get(0));
		
		lista.add("Gabriel");
		lista.add("João Paulo");
		lista.add("João Pedro");
		lista.add("Arthur");
		
		
		System.out.println(lista);
		
		//para saber o tamanho
		System.out.println(lista.size());
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		for(String nome: lista) {
			System.out.println(nome);
		}
		
		lista.forEach(nome -> System.out.println(nome));
	}
}
