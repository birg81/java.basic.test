package model;
public class Stack<T> implements ADT {
	private Node<T> lst;
	private int n;
	public final int MAX_SIZE;
	public Stack(int size) {
		lst = null;
		n = 0;
		MAX_SIZE = size;
	}
	public Stack() {
		this(5);// Integer.MAX_VALUE);
	}
	@Override
	public int size() {
		return n;
	}
	@Override
	public boolean isEmpty() {
		return n == 0 && lst == null;
	}
	@Override
	public boolean isFull() {
		return n >= MAX_SIZE;
	}
	public boolean push(T elem) {
		if (!isFull()) {
			lst = new Node<>(elem, lst);
			n++;
			return true;
		}
		return false;
	}
	public T pop() {
		if (!isEmpty()) {
			Node<T> node = lst;
			lst = lst.getLnk();
			node.setLink();
			n--;
			return node.getElem();
		}
		return null;
	}
	@Override
	public String toString() {
		String s = "";
		for (Node<T> node = lst; !isEmpty()
				&& node != null; node = node.getLnk())
			s += (!s.isBlank() ? ", " : "") + node.getElem().toString();
		return "[%s]".formatted(!s.isBlank() ? s : "**VOID LIST**");
	}
}