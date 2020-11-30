package OOPLab7;

import java.util.HashMap;
import java.util.Map;
public class MyMap <K extends Object, V extends Object>{
	
	private Map<K, V> map = new HashMap<>();

	public V get(K keyword) {
		return map.get(keyword);
	}

	public void put(K keyword, V value) {
		map.put(keyword, value);
	} 
	public void PrintObject() {
		for(K keyword : map.keySet())
		{
			System.out.printf("Key: \"%s\"\t - Value: \"%s\"\n", keyword, map.get(keyword));
		}
	}
	
	public static void main(String[] args) {
	
		MyMap map1a = new MyMap(); 
	    map1a.put('1', 1);
	    map1a.put(2, "Hello");
	    map1a.put("Hole", 3.14); 
		map1a.PrintObject(); 
		
		
		MyMap<String, Integer> map1b = new MyMap();
		map1b.put("Hello", 7);
		map1b.PrintObject();
		
	}

}
