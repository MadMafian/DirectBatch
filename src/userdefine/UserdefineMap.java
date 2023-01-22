package userdefine;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserdefineMap {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(1001);
		e.setName("Madhan");
		
		Employee e1=new Employee();
		e1.setId(1002);
		e1.setName("Mathi");
		
		Map<String, Employee> m=new LinkedHashMap<>();
		m.put("Java", e);
		m.put("Selenium", e1);
		
		Set<Entry<String, Employee>> entrySet = m.entrySet();
		
		for (Entry<String, Employee> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println("Employee id is :" + entry.getValue().getId());
			System.out.println("Employee Name is :" + entry.getValue().getName());
		}
		
		
		
		
		
}

}
