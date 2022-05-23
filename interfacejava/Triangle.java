package interfacejava;

public class Triangle implements Shape{

private int base,height;
	
	public Triangle(int base,int height) {
		this.base=base;
		this.height=height;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}

	public double getArea() {
		return .5*base*height;
	}
}
