package StringPack;

public class EndsWithMethodsDemo {
	
	public static void main(String []args)
	{
		
		String name = "I love the Java Programming";
		
		
		boolean d=name.endsWith("Programming");
		
		System.out.println(d);
		
		if(d)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		
	}

}
