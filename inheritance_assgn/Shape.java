package inheritance_assgn;

class Shape {
	
	String colour = "";
	
	Shape(String colour){
		this.colour=colour;
	}
	
	double getArea() {
		System.out.println("Shape unknown...");
		return 0;
	}
		
	

	public String toString() {
		return "Shape [colour=" + colour + "]";
	}
	

}
