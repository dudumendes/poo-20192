package aula29082019;

public class AppMenu {
	public static void main(String[] args) {
		int[] keys = { 13, 27, 10, 8 };
		String[] titles = {"UNI7", "Pos Graducao", "Graducao", "Direito"};
 		
		TreeMenu tree = new TreeMenu();
		
		for (int i = 0; i < keys.length; i++) {
			tree.add(new NodeMenu(keys[i], titles[i]));
		}
		
		tree.printIndentedKey();
	}
}
