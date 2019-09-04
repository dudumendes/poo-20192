package aula29082019;

public class TreeMenu extends BinarySearchTree {

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
}
