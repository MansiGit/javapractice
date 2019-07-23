package inheritance;

public class person {
	String name, address;

	person() {
		name = "default";
		address = "default";
	}

	public person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	void display()
	{
		System.out.println("name : "+name+" address: "+address);
	}
	
}



