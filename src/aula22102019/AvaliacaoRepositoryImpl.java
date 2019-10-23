package aula22102019;

public class AvaliacaoRepositoryImpl implements AvaliacaoRepository {
	private Media media;
	
	public AvaliacaoRepositoryImpl() {
		this.media = new Media();
	}
	
	public void media(double vp1, double vp2, double vf) {
		media.setVf(vf);
		media.setVp1(vp1);
		media.setVp2(vp2);
		
		System.out.println(media.media());
	}

}
