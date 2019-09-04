package aula29082019;

public class AppMenu {
	public static void main(String[] args) {
		int[] numbers = { 13, 27, 10, 8 };
		
		BinarySearchTree tree = new BinarySearchTree();
		
		for (int i = 0; i < numbers.length; i++) {
			tree.add(numbers[i]);
		}
		
		tree.preOrder();
		System.out.println("\n");
		tree.printIndentedKey();
	}
}
