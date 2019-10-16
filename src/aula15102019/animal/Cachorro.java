package aula15102019.animal;

import aula15102019.Domesticavel;

public class Cachorro extends Animal implements Domesticavel {
	
	public void andar() {
		System.out.println("Cachorro andando");
	}
	
	public void brincar() {
		System.out.println("Cachorro brincando");
	}
	
}
