package inheritance_assgn;

public class RectangleAbs extends ShapeAbs{

private int length,width;
	
	public RectangleAbs(String colour,int length,int width) {
		super(colour);
		this.length=length;
		this.width=width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", colour=" + super.toString() + "]";
	}
	
	public double getArea() {
		return length*width;
	}
}
