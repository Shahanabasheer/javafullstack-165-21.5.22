package inheritance_assgn;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s=new Rectangle("Red",4,6);
		
		System.out.println(s);
		System.out.println("Area of rectangle: "+s.getArea());
		
		s=new Triangle("Blue",5,8);
		System.out.println(s);
		System.out.println("area of triangle: "+s.getArea());

	}

}
