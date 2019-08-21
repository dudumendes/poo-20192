package aula20082019;

public class PubApp {
	public static void main(String[] args) {
		
		Cerveja[] pack = new Cerveja[3];
		
		pack[0] = new Cerveja();
		pack[0].marca = "Colorado";
		pack[0].teorAlcoolico = 7.8;
		pack[0].tipo = "Ale";
		
		pack[1] = new Cerveja();
		pack[1].marca = "Heineken";
		pack[1].teorAlcoolico = 6.8;
		pack[1].tipo = "Lager";
		
		pack[2] = new Cerveja();
		pack[2].marca = "Stella Artois";
		pack[2].teorAlcoolico = 5.8;
		pack[2].tipo = "Lager";
		
		for (int i = 0; i < pack.length; i++) {
			pack[i].exibir();
		}
		
	}
}
