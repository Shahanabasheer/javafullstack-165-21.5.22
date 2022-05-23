package interfacejava;


public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Rectangle(4,6);
		
		System.out.println(s);
		System.out.println("Area of rectangle: "+s.getArea());
		
		s=new Triangle(5,8);
		System.out.println(s);
		System.out.println("area of triangle: "+s.getArea());
	}

}
