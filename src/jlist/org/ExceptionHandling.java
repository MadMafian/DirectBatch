package jlist.org;

public class ExceptionHandling {
	public static void main(String[] args) {
	System.out.println(1);
	System.out.println(2);
	System.out.println(3);
	try {
		System.out.println(4/0);
	} catch (Exception e) {
		System.out.println("Do not divide a number by 0");
	}
	finally {
		System.out.println("Success");
	}
	System.out.println(5);
	System.out.println(6);
	System.out.println(7);
}
}
