package generics;

public class GenericBox<T>
{
	private T t;
	
	public void set(T t)
	{
		this.t = t;
	}
	
	public T get()
	{
		return this.t;
	}
	
	public void add(T t)
	{
		
	}
	
	public class test
	{
		public void run()
		{
			GenericBox<String> gb = new GenericBox<String>();
			gb.add(1);
		}
	}
}




