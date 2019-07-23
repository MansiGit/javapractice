package inheritance;

public class themain {
	public static void main(String arg[]) {
	employee e= new employee();
	student s=new student();
	
	e.setName("Mansi");
	e.setAddress("Pune");
	e.setEmpID(25);
	e.setSal(450000);
	
	s.setName("Arpna");
	s.setAddress("Delhi");
	s.setStdID(13);
	s.setMarks(97);
	
	
	e.display();
	s.display();
	System.out.println(e.getName());

	}
}
