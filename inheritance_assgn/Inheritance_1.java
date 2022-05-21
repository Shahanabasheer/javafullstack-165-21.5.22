package inheritance_assgn;

public class Inheritance_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cylinder c=new Cylinder();
		
		System.out.println("Volume.."+c.getVolume());
		
		Cylinder c1=new Cylinder(3,6);
		System.out.println("volume..2 :"+c1.getVolume());
		
	}

}
