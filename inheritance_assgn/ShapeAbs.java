package inheritance_assgn;

abstract public class ShapeAbs {

	private String colour;
	
	public ShapeAbs(String colour) {
		this.colour=colour;
	}

	@Override
	public String toString() {
		return "ShapeAbs [colour=" + colour + "]";
	}
	abstract public double getArea();
}
