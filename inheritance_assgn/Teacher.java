package inheritance_assgn;

import java.util.Arrays;

class Teacher extends Person{
	private int numCourses=0;
	private String courses[]= {};
	private static final int MAX_COURSES = 5;
	
	Teacher(String name,String address){
		super(name,address);
		numCourses=0;
		courses=new String[numCourses];
	}
	
	
	
	@Override
	public String toString() {
		return "Teacher :"+super.toString();
	}



	boolean addCourse(String course) {
		for(int i=0;i<numCourses;i++) {
			if(course.equals(courses[i]))
				return false;
		}
		courses[numCourses]=course;
		numCourses++;
		return true;
	}
	
	boolean removeCourse(String course) {
		int intex=0;
		int r=0;
		
		
		for(int i=0;i<numCourses;i++) {
			if(course.equals(courses[i])) {
				intex=i;
				r=1;
				break;
			}
		}
		for(int j=intex;j<numCourses;j++) {
			courses[j]=courses[j+1];
		}
		
		if(r==1) {
			numCourses--;
			return true;
			}
		else
			return false;
	}
}