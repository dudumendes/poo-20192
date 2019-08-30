package aula29082019;

public class BinarySearchTree {
	Node _root;
	
	public void add(int key) {
		if (_root == null) {
			_root = new Node(key);
		} else {
			add(_root, key);
		}
	}
	
	public void add(Node node, int key) {
		if(key < node.key) {
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
		preOrder(_root);
	}
	
	public void preOrder(Node node) {
		if (node != null) {
			System.out.println(node.key);
			preOrder(node.leftChild);
			preOrder(node.rightChild);
		}
	}
	
	public void printIndentedKey() {
		printIndentedKey(_root);
	}

	public void printIndentedKey(Node node) {
		String buffer = "";
		
		if (node != null) {
			for (int i = 0; i < node.depth(); i++) {
				buffer += "- ";
			}
			System.out.println(buffer + node.key);
			
			printIndentedKey(node.leftChild);
			printIndentedKey(node.rightChild);
		}		
	}
}












