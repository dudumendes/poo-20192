package aula29082019;

public class TreeMenu extends BinarySearchTree {

	public void add(Node node) {
		if (_root == null) {
			_root = node;
		} else {
			add(_root, node);
		}
	}
	
	public void add(Node node, Node newNode) {
		if(newNode.key < node.key) {
			if (node.hasLeftChild()) {
				add(node.leftChild, newNode);
			} else {
				node.leftChild = newNode;
				node.leftChild.parent = node;
			}
		} else {
			if (node.hasRightChild()) {
				add(node.rightChild, newNode);
			} else {
				node.rightChild = newNode;
				node.rightChild.parent = node;
			}
		}
	}
}
