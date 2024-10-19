package CollectionsFramwork;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemoTwo {
	
	
	public static void main(String[] args) {
		
		List<Integer>  List =new ArrayList<>();
		
		List.add(9);
		List.add(5);
		List.add(6);
		List.add(4);
		List.add(9);
		List.add(9);
		
		
		for(Integer a : List)
		{
			System.out.println(a);
		}
		
		
	}

}
