package ExceptionHandlingDemo;

public class ArrayOutOfException {
	
	
	public static void main(String[] args) {
		
		
		
		int []arr= new int[3];
		
		try {
			arr[0]=12;
			arr[1]=13;
			arr[2]=76;
			arr[3]=34;
			
		}
		
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Exception got handled ");
			
			
		}
		
		System.out.println(arr[2]);
		// System.out.println(arr[3]);
		
		System.out.println("End of the Programm");
	}

}
