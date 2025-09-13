package Functions;

public class Parameterization {

	public static void main(String[] args) {
		int principle  = 1000;
		int time = 1;
		int rate = 12;
	Interestcalculation(principle,time,rate);

	}
	
	public static void Interestcalculation(int principle, int time, int rate)
	{
		System.out.println((principle*time*rate)/100);
	}

}
