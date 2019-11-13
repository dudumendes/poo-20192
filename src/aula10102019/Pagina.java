package aula10102019;

public abstract class Pagina {
	
	public void topo() {
		System.out.println("=========== CABECALHO ========");
	}
	
	public void rodape() {
		System.out.println("============  RODAPE  ========");
	}
	
	public void menu() {}
	
	public void contato() {}
	
	public void margemAbaixo() {}
	
	public abstract void corpo();

	//Este eh o metodo gabarito (template-method)
	public final void exibir() {
		topo();
		menu();
		corpo();
		contato();
		rodape();
		margemAbaixo();
	}
}
