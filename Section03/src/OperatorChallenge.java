
public class OperatorChallenge
{

	public static void main(String[] args)
	{
		double value1 = 20;
		double value2 = 80;
		
		double value3 = (value1 + value2) * 100;
		
		double rem = value3 % 40;
		
		boolean b = (rem == 0) ? true : false;
		
		System.out.println("boolean: " + b);
		
		if (!b)
		{
			System.out.println("Got some remainder");
		}
		else
		{
			System.out.println("No remainder");
		}

	}

}
