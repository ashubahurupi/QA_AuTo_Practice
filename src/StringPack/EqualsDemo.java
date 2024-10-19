package StringPack;

public class EqualsDemo {
	
	
	public static void main(String[] args) {
		
	String str1="Ashish";
	String str2="Bahurupi";
	String str3="QA Engineer";
	String str4="nagpur";
	String str5="Ashish";
	
	if(str1.equals(str5))
	{
		System.out.println("Equals");
	}
	else
	{
		System.out.println("Not equals");
	}
	
	System.out.println("--------------------------------------------------------------");
	
	int a=6;
	int b=7;
	int d=6;
	
	if(a==d){
		System.out.println(true);
	}
	else
	{
		System.out.println(false);
	}

}
}