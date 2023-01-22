package userdefine;

import java.util.ArrayList;
import java.util.List;

public class UserdefineList {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(100);
		e.setName("Madhan");
		
		Employee e1=new Employee();
		e1.setId(101);
		e1.setName("Mathi");
		
		List<Employee> li=new ArrayList<>();
		li.add(e);
		li.add(e1);
//		for (Employee emp : li) {
//			System.out.println("Employee id is :" + emp.getId());
//			System.out.println("Employee name is :" + emp.getName());
//		}
		for (int i = 0; i < li.size(); i++) {
			System.out.println("Employee id is :" + li.get(i).getId());
			System.out.println("Employee Name is " + li.get(i).getName());
		}
		
	}

}
