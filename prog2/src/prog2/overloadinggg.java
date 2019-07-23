package prog2;

public class overloadinggg {
	static int add(int x,int y)
	{
		return x+y;
	}
	static float add(int x,int y,int z)
	{
		return x+y+z;
	}
	public static void main(String argd[])
	{
		System.out.println(add(6,7));
		System.out.println(add(7,8,9));
		
	}
}
