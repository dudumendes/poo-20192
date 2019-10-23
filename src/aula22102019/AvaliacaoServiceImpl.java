package aula22102019;

public class AvaliacaoServiceImpl implements AvaliacaoService {
	
	private AvaliacaoRepository repository;
	
	public AvaliacaoServiceImpl() {
		repository = new AvaliacaoRepositoryImpl();
	}
	
	public void media(double vp1, double vp2, double vf) {
		repository.media(vp1, vp2, vf);
	}

}
