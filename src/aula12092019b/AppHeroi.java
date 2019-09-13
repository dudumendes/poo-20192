package aula12092019b;

public class AppHeroi {
	public static void main(String[] args) {
		Heroi superman = new Heroi("Clark Kent", "Superman");
		
		superman.addPoder(new Invisibilidade());
		superman.addPoder(new SuperForca());
		
		superman.usarPoder();
		
		Heroi fenix = new Heroi("Jean Grey", "Fenix");
		fenix.addPoder(new Poder("hshshsshshshshs", true));
		fenix.addPoder(new Poder("xablaum", true));
		fenix.addPoder(new Poder("saidomeicachorro", true));
		fenix.addPoder(new Poder("hadooooouken", true));
		
		fenix.usarPoder();
	}
}
