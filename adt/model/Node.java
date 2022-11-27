package model;
public class Node<T> {
	private T elem;
	private Node<T> lnk;
	public Node(T elem, Node<T> lnk) {
		this.elem = elem;
		this.lnk = lnk;
	}
	public Node(T elem) {
		this(elem, null);
	}
	public Node() {
		this(null);
	}
	public T getElem() {
		return elem;
	}
	public Node<T> getLnk() {
		return lnk;
	}
	public void setElem(T elem) {
		this.elem = elem;
	}
	public void setLnk(Node<T> lnk) {
		this.lnk = lnk;
	}
	public void setLnk(T elem) {
		setLnk(new Node<>(elem));
	}
	public void setLink() {
		lnk = null;
	}
	@Override
	public String toString() {
		return elem.toString();
	}
}
