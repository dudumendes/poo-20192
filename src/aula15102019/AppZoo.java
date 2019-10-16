package aula15102019;

import java.util.ArrayList;

import aula15102019.animal.Cachorro;
import aula15102019.animal.Animal;
import aula15102019.animal.Leao;
import aula15102019.robo.CaoRobo;

public class AppZoo {
	
	public static void main(String[] args) {
		
		Cachorro cao = new Cachorro();
		Leao leo = new Leao();
		CaoRobo robo = new CaoRobo();

 		
		ArrayList<Animal> zoo = new ArrayList<>();
		zoo.add(cao);
		zoo.add(leo);
		//zoo.add(robo);
		
		ArrayList<Domesticavel> puppies = new ArrayList<>();
		puppies.add(cao);
		puppies.add(robo);
		
		ArrayList<Criavel> crias = new ArrayList<>();
		crias.add(cao);
		crias.add(leo);
		crias.add(robo);
		
		for (Animal a : zoo) {
			a.andar();
		}
		
		for (Domesticavel d: puppies) {
			d.brincar();
		}
		
		for (Criavel c : crias) {
			c.toString();
		}
		
	}
	
}
