package aula22102019;

public class AvaliacaoController {
	private AvaliacaoService avaliacaoService;
	
	public AvaliacaoController() {
		avaliacaoService = new AvaliacaoServiceImpl();
	}
	
	public void media(double vp1, double vp2, double vf) {
		this.avaliacaoService.media(vp1, vp2, vf);
	}
	
}
