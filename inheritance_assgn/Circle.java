package inheritance_assgn;

class Circle{
	private double radius;
	private String colour;
	
	Circle(){
		
	}
	Circle(double radius){
		
		this.radius=radius;
		
	}
	double getRadius() {
		return radius;
	}
	
	double getArea() {
		return(3.14*radius*radius);
	}
}