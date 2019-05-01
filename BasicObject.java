package Objects;

public class BasicObject {
	
	
	public BasicObject() {
		System.out.println("inside this class");
	}
	
	public BasicObject(String n) {
		System.out.println("inside this class"+n);
	}
	
	public BasicObject(String name,int age) {
		this.name=name;
		this.age=age;
	}
	String name;
	int age;
	static String course;
	
	public void address() {
		
		System.out.println("student name:"+name + " age:"+age+" & address is Blore");
	}
	
	public void orgname() {
		
		System.out.println("student name:"+name+" age:"+age+" & org is VMware");
		
	}

}
