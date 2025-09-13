package Functions;

public class BreakvsContinue {
	public static void main(String[] args)
	{
	int val =5;
	
for(int i=1;i<=10;i++)
{
 if(i==val){
	break; // break means that come out of that loop if condition matches
	}
System.out.println(i);
	}

for(int j =1;j<=10;j++)
{
	if(j==val)
	{
		continue; //continue means skip that value i.e skip 5
	}
	System.out.println(j);
	}
	
	}

	
}
