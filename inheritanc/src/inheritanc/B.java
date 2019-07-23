package inheritanc;

class inheritss {

	inheritss() {
		System.out.println("in A const");
	}
	void show()
	{
		System.out.println("dddd");
	}
}
public class B extends inheritss{
	
	B()
	{ 
		System.out.println("in B const");
	}
	void show()
	{
		System.out.println("fffff");
	}
	public static void main(String a[])
	{
		
		inheritss b = new B();
		b.show();
	}
}
/*
 * cheate a class person set, get,display for name and addr
 * creatw class employye extending person with empId ,sal provide set,get for empid and sal, override the display
 * creatw student with stdID, marks extends person, override display in student.
 * make a main and calls*/
 