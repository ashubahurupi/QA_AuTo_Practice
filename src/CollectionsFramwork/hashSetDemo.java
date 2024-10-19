package CollectionsFramwork;

import java.util.HashSet;
import java.util.Set;

public class hashSetDemo {
	
	public static void main(String[] args) {
		
		
		Set<Integer> set=new HashSet<Integer>();
		
		
		set.add(9);
		set.add(5);
		set.add(0);
		set.add(9);
		set.add(4);
		
		
		for(Integer h: set)
		{
			System.out.println(h);
		}
	}

}
