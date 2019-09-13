package aula12092019;

public class AppHeroi {
	public static void main(String[] args) {
		Heroi superman = new Heroi("Clark Kent", "Superman");
		
		superman.poderes.add(new Invisibilidade());
		superman.poderes.add(new SuperForca());
		
		superman.usarPoder();
		
		Heroi fenix = new Heroi("Jean Grey", "Fenix");
		fenix.poderes.add(new Poder("hshshsshshshshs", true));
		fenix.poderes.add(new Poder("xablaum", true));
		fenix.poderes.add(new Poder("saidomeicachorro", true));
		fenix.poderes.add(new Poder("hadooooouken", true));
		
		fenix.usarPoder();
	}
}
