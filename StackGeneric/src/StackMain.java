
public class StackMain {

	public static void main(String[] args) {
		Stack<String> stk=new Stack<>();
		stk.push("Delhi");
		stk.push("Mumbai");
		stk.push("Pune");
		System.out.println(stk.pop()+stk.pop()+stk.pop());
		
	}

}
