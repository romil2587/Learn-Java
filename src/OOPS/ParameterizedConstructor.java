package OOPS;

public class ParameterizedConstructor {

	public static void main(String[] args) {
		Common c1 = new Common("Romil Singhtwadia");
		Common c2 = new Common("Pujal Singhtwadia");
		Common c3 = new Common("Tashvi Singhtwadia");
		Common c4 = new Common("Khushbu Singhtwadia");
	}
	

}
class Common
{
	Common(String name){
		System.out.println(name);
		
	}
}