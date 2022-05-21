package inheritance_assgn;

public class TestShapeAbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShapeAbs s=new RectangleAbs("Red",4,6);
		
		System.out.println(s);
		System.out.println("Area of rectangle: "+s.getArea());
		
		s=new TriangleAbs("Blue",5,8);
		System.out.println(s);
		System.out.println("area of triangle: "+s.getArea());
		
		//s=new ShapeAbs("Green");
	}

}
