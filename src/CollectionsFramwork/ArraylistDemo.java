package CollectionsFramwork;

import java.util.ArrayList;



public class ArraylistDemo {
	
	public static void main(String[] args) {
	
		
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(9);
		al.add(4);
		al.add(5);
		al.add(7);
		
	// 	For Loop 
//		for(int i=0; i<al.size(); i++)
//		{
//			System.out.println(al.get(i));
//		}
		
		
	// For each Loop 	
		for(Integer i :al)
		{
			System.out.println(i);
		}
	}

}
