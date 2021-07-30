package constructors;

public class Car
{
	private String name;
	
	public Car(String name)
	{
		this.name = name;
	}
	
	public Car()
	{
		this("random name");
	}
}