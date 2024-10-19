package StringPack;

public class IndexOfDemo {
	
	public static void main(String[]args)
	{
		String name="Ashish Bahurupi";
		int b = name.indexOf('B');
		int c = name.indexOf('i');
		
		int x = name.lastIndexOf('i', 6);
		System.out.println(x);
		System.out.println(b);
		System.out.println(c);
	}

}
