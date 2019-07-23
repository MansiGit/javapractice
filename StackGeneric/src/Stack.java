import java.util.*;

public class Stack<T> {
	LinkedList<T> list = new LinkedList<>();

	public void push(T e) {
		list.addFirst(e);
	}

	public T pop() {
		try {
			T x = list.getFirst();
			list.removeFirst();
			return x;
		} catch (NoSuchElementException e) {
			return null;
		}
	}
	public int getSize(){
		return list.size();
	}
	public boolean isEmpty(){
		return list.size()==0;
	}
}
