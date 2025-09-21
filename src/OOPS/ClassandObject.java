package OOPS;

public class ClassandObject {

	public static void main(String[] args) {
		
    Employee emp1 = new Employee();
    System.out.println(emp1.name);
    System.out.println(emp1.empName());
    emp1.printName();

	}

}

class Employee{
	String name = "Romil Singhtwadia";
	public String empName()
	{
		return this.name;
	}
	public void printName()
	{
		System.out.println(this.name);
	}
}