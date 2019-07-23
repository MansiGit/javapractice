import java.util.*;
public class Queue <T>{
	LinkedList<T> que=new LinkedList<>();
	public void add(T e) {
		que.addLast(e);
	}

	public T remove() {
		try {
			T x = que.getFirst();
			que.removeFirst();
			return x;
		} catch (NoSuchElementException e) {
			return null;
		}
	}
	public int getSize(){
		return que.size();
	}
	public boolean isEmpty(){
		return que.size()==0;
	}
}
