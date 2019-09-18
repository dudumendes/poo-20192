package aula17092019;

public class App {
	public static void main(String[] args) {
		Parque veadeiros = new ParqueNacional("Parque Nacional dos Veadeiros",
												"Goias",
												"1961");
		
		AtracaoTuristica at1 = new AtracaoTuristica("Maytrea");
		AtracaoTuristica at2 = new AtracaoTuristica("Chapada da Lua");
		AtracaoTuristica at3 = new AtracaoTuristica("Cachoeira do Véu da Noiva");
		
		veadeiros.cadastrarAtracao(at1);
		veadeiros.cadastrarAtracao(at2);
		veadeiros.cadastrarAtracao(at3);
		
		veadeiros.listarAtracoes();
	}
}
