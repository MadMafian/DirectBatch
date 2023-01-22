package jlist.org;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapSample{

	
	public static void main(String[] args) {
	Map<Integer, String> m=new HashMap<>();
	 
	m.put(10, "Mad");
	m.put(20, "Oli");
	m.put(30, "Mathi");
	m.put(40, "Mad");
	
	Set<Entry<Integer, String>> entrySet = m.entrySet();
	System.out.println(entrySet);
	
	for (Entry<Integer, String> entry : entrySet) {
		System.out.println(entry);
	}
	Set<Integer> keySet = m.keySet();
	for (Integer integer : keySet) {
		System.out.println(integer);
	}
	Collection<String> values = m.values();
	for (String string : values) {
		System.out.println(string);
		
	}
//	for (Entry<Integer, String> entry : entrySet) {
//		System.out.println(entry.getKey());
//	}
//	for (Entry<Integer, String> entry : entrySet) {
//		System.out.println(entry.getValue());
//	}
	
	}
	
	
	
}
