package aula29082019;

public class NodeMenu extends Node {
	String title;
	
	public NodeMenu(int key, String title) {
		super(key);
		this.title = title;
	}
	
	public NodeMenu(int key, String title, Node parent) {
		super(key, parent);
		this.title = title;
	}
	
	public String toString() {
		return "" + getKey() + ": " + title;
	}
}
