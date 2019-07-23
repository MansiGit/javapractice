package prog2;

class prog2
{
	static long factorial(int n)
	{
		int res=1;
		for (int i=2;i<=n;i++)
			res*=i;
		return res;
	}
	public static void main(String a[])
	{
		long res= factorial(5);
		System.out.println(res);
	}
}