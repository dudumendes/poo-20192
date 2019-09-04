package aula29082019;

public class Node {
	int key;
	Node parent;
	Node leftChild;
	Node rightChild;
	
	public Node(int key) {
		this.key = key;
	}
	
	public Node(int key, Node parent) {
		this(key);
		this.parent = parent;
	}
	
	public boolean isRoot() {
		return this.parent == null;
	}
	
	public boolean hasLeftChild() {
		return this.leftChild != null;
	}
	
	public boolean hasRightChild() {
		return this.rightChild != null;
	}
	
	public int depth() {
		if (this.isRoot()) {
			return 0;
		} else {
			return this.parent.depth() + 1;
		}
	}

	public String toString() {
		return "" + key;
	}
	
	
	
	
	
	
}
