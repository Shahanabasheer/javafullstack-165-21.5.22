package inheritance_assgn;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Anjali","House no 4");
		Student s2=new Student("Arya","house no 7");
		
		s1.addCourseGrade("Java",9);
		s1.addCourseGrade("C++", 7);
		s1.addCourseGrade("Python",8);
		
		s1.printGrades();
		System.out.println("Average of student_1: "+s1.getAverageGrade());
		
		Teacher t=new Teacher("Veena","House 2");
		
		t.addCourse("Java");
		t.addCourse("Pyhthon");
		t.addCourse("C++");
		
		

	}

}
