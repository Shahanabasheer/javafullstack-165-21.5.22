package inheritance_assgn;

class Cylinder extends Circle{
	
	private double height;
	public Cylinder(){
		super();
	}
	
	public Cylinder(double radius){
		super(radius);
	}
	
	public Cylinder(double radius,double height){
		
		super(radius);
		this.height=height;
	}
	
	double getHeight() {
		return height;
	}
	
	double getVolume() {
		return(getArea()*height);
	}
}
