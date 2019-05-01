package Objects;

public class BasicObject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicObject o=new BasicObject();
		o.name="abcdefg";
		o.age=45;
		BasicObject.course="op";
		o.address();
		o.orgname();
		BasicObject x=new BasicObject("abc",78);
		BasicObject y=new BasicObject("op",3);
		BasicObject z=new BasicObject("xyz");
		z.name="CCCC";
		System.out.println(x.name+"......"+x.age);
		System.out.println(y.name+"......"+y.age);
		System.out.println(z.name);
		
		x=y;
		y=z;
		z=x;
		
		System.out.println(x.name);
		System.out.println(y.name);
		System.out.println(z.name);
		
		

	}

}
