package aula27082019;

public class PatoMain {
	public static void main(String[] args) {
		TipoDeVoo tv1 = new TipoDeVoo();
		Pato p1 = new Pato("Pateta", tv1);
		
		Pato p2 = new Pato("Lino", new VooAJato());
		
		Pato p3 = new Pato("Donald", new VooDeCruzeiro());
		
		p1.voar();
		p2.voar();
		p3.voar();
				
	}
}
