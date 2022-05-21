package inheritance_assgn;

import java.util.Arrays;

class Student extends Person{
	private int numCourses=0;
	private String courses[]= {};
	private int grades[]= {};
	private static final int MAX_COURSES = 30;
	
	Student(String name,String address){
		super(name,address);
		courses=new String[MAX_COURSES];
		grades=new int[MAX_COURSES];
		
	}
	
	
	
	@Override
	public String toString() {
		return "Student:"+super.toString();
	}



	void addCourseGrade(String course,int grade) {
		courses[numCourses]=course;
		grades[numCourses]=grade;
		numCourses++;
	}
	
	void printGrades() {
		for(int i=0;i<numCourses;i++) {
			System.out.println(courses[i]+" "+grades[i]);
		}
	}
	double getAverageGrade() {
		int sum=0;
		
		for(int i=0;i<numCourses;i++) {
			sum=sum+grades[i];
		}
		return(sum/numCourses);
	}
}