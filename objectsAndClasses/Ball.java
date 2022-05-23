package objectsAndClasses;

public class Ball {
	
	private double x=0.0;
	private double y=0.0;
	
	Ball(){
		super();
	}
	Ball(double x,double y){
		this.x=x;
		this.y=y;
	}

	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	void setXY(double x,double y) {
		System.out.println("Position of ball is at ("+x+","+y+")");
		
	}
	void setXYSpeed(double xSpeed,double ySpeed) {
		x=xSpeed;
		y=ySpeed;
		System.out.println("Speed of the ball increased by..");
	}
	void move(double xDisp,double yDisp) {
		x=x+xDisp;
		y=y+yDisp;
		System.out.println("Ball moving..("+x+","+y+")");
	}
	
	
	@Override
	public String toString() {
		return "Ball [x=" + x + ", y=" + y + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ball b1=new Ball(2,3);
		b1.move(2,3);
		System.out.println(b1.toString());
		
		Ball b2=new Ball();
		
		b2.setXY(4,5);
		b2.setXYSpeed(15,18);
		System.out.println(b2.toString());
	}

}
