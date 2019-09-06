package aula29082019;

public class TreeMenu extends BinarySearchTree {

	public void add(Node node) {
		if (isRootNull()) {
			setRoot(node);
		} else {
			add(getRoot(), node);
		}
	}
	
	public void add(Node node, Node newNode) {
		if(newNode.getKey() < node.getKey()) {
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
