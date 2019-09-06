package aula29082019;

public class BinarySearchTree {
	private Node root;
	
	public Node getRoot() {
		return this.root;
	}
	
	public void setRoot(Node root) {
		if (root.getKey() >= 0)
			this.root = root;
	}
	
	public boolean isRootNull() {
		return this.root == null;
	}
	
	public void add(int key) {
		if (root == null) {
			root = new Node(key);
		} else {
			add(root, key);
		}
	}
	
	public void add(Node node, int key) {
		if(key < node.getKey()) {
			if (node.hasLeftChild()) {
				add(node.leftChild, key);
			} else {
				node.leftChild = new Node(key, node);
			}
		} else {
			if (node.hasRightChild()) {
				add(node.rightChild, key);
			} else {
				node.rightChild = new Node(key, node);
			}
		}
	}
	
	public void preOrder() {
		preOrder(root);
	}
	
	public void preOrder(Node node) {
		if (node != null) {
			System.out.println(node);
			preOrder(node.leftChild);
			preOrder(node.rightChild);
		}
	}
	
	public void printIndentedKey() {
		printIndentedKey(root);
	}

	public void printIndentedKey(Node node) {
		String buffer = "";
		
		if (node != null) {
			for (int i = 0; i < node.depth(); i++) {
				buffer += "- ";
			}
			System.out.println(buffer + node);
			
			printIndentedKey(node.leftChild);
			printIndentedKey(node.rightChild);
		}		
	}
}












