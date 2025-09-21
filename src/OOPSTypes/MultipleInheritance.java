package OOPSTypes;

public class MultipleInheritance {

	public static void main(String[] args) {
		Putra s1 =new Putra();
		s1.father_print();
		s1.mother_print();

	}

}
interface father{
	public void father_print();
}
interface mother{
	public void mother_print();
}
class Putra implements father, mother{
	
	public void father_print() {
		System.out.println("This is father");
	}
	
	public void mother_print() {
		System.out.println("This is mother");
	}
}