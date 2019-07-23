
public class QueueMain {
	public static void main(String[] args) {
		Queue<String> stk=new Queue<>();
		stk.add("Delhi");
		stk.add("Mumbai");
		stk.add("Pune");
		System.out.println(stk.remove()+stk.remove()+stk.remove());
		
	}
}
