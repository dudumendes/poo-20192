package aula03102019;

public class Titulacao {
	private String area;
	private String titulo;
	private String instituicao;
	
	public Titulacao(String area, String titulo, String instituicao) {
		this.area = area;
		this.titulo = titulo;
		this.instituicao = instituicao;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Titulacao) {
			
			return ((Titulacao) obj).area.equals(this.area)
					&& ((Titulacao) obj).titulo.equals(this.titulo)
					&& ((Titulacao) obj).instituicao.equals(this.instituicao);
			
		} else {
			return false;
		}
		
		
	}
}
