package userdefine;

import java.util.LinkedHashSet;
import java.util.Set;

public class UserdefineSet {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(10);
		e.setName("Madhan");
		
		Employee e1=new Employee();
		e1.setId(11);
		e1.setName("Mathi");
		
		Set<Employee> s=new LinkedHashSet<>();
		s.add(e);
		s.add(e1);
		
		for (Employee emp : s) {
			System.out.println("Employee id is :" + emp.getId());
			System.out.println("Employee name is :" + emp.getName());
		}
	
}
}
