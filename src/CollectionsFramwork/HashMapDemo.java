package CollectionsFramwork;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	
	public static void main(String[] args) {
		
		Map<String, Object> map=new HashMap<>();
		
		map.put("Name","Ashish");
		map.put("Lastname", "Bahurupi");
		map.put("Location", "warud");
		map.put("Experiance","4.5");
		map.put("Experiance1","4.5");
		System.out.println(map);		
		
		// Retrive
		System.out.println(map.get("Location"));
		
		System.out.println(map.get("Name"));
		
	}
}