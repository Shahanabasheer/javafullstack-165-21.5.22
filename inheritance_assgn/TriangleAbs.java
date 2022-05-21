package inheritance_assgn;

public class TriangleAbs extends ShapeAbs{
	private int base,height;
	
	public TriangleAbs(String colour,int base,int height) {
		super(colour);
		this.base=base;
		this.height=height;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height +" " + super.toString() + "]";
	}

	public double getArea() {
		return .5*base*height;
	}
}
