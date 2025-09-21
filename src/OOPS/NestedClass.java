package OOPS;

public class NestedClass {

	public static void main(String[] args) {
		College c1 = new College();
		c1.getCollegeData();
	//	Student s2  = new Student(); this statement is invalid,student class can't access outside from college class.Student class is Nested Class 
	}
}

class College{
	
	class Student{
		
		public void getStudentData(){
			System.out.println("Student Class");
		}
	}
	
	public void getCollegeData(){
		System.out.println("College Class");
		Student s1 = new Student();
		s1.getStudentData();
	
	}	
}