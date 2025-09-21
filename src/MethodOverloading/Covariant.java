package MethodOverloading;

public class Covariant {

	public static void main(String[] args) {
	Client c1= new Client();
	c1.Login();

	}

}
class Owner{
	public int Login() {
		System.out.println("Owner Login");
		return 5;
	}
}
class Client extends Owner{
	
    @Override
	public String Login() {
		System.out.println("Client Login");
		return "Client";
	}
}