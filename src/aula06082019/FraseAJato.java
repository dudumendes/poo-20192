package aula06082019;

public class FraseAJato {
	public static void main(String[] args) {
		
		String[] sujeitos = {"Gabriel", "Fructuoso", "Joao"};
		String[] verbos = {"voltou", "comeu", "andou", "sentou" };
		String[] complementos = {"hoje", "agora", "sozinho", "feliz", "amancebado"};
		
		int tamanho1 = sujeitos.length;
		int tamanho2 = verbos.length;
		int tamanho3 = complementos.length;
		
		int rand1 = (int) (Math.random() * tamanho1);
		int rand2 = (int) (Math.random() * tamanho2);
		int rand3 = (int) (Math.random() * tamanho3);
		
		String frase = sujeitos[rand1] + " " + verbos[rand2] + " " + complementos[rand3];
		
		System.out.println("Sua frase: " + frase);
	}
}
