package inheritance_assgn;

public class Triangle extends Shape{
	private int base,height;
	
	public Triangle(String colour,int base,int height) {
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
