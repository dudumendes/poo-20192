package aula22102019;

public class Media {
	private double vp1;
	private double vp2;
	private double vf;
	
	public Media() {}
	
	public Media(double vp1, double vp2, double vf) {
		this.vp1 = vp1;
		this.vp2 = vp2;
		this.vf = vf;
	}
	
	public double media() {
		return (vp1 + 2 * vp2 + 3 * vf) / 6;
	}
	
	public void setVp1(double vp1) {
		this.vp1 = vp1;
	}
	public void setVp2(double vp2) {
		this.vp2 = vp2;
	}
	public void setVf(double vf) {
		this.vf = vf;
	}
}
