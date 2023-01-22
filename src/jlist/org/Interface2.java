package jlist.org;

public class Interface2 implements Bike,Car {

	@Override
	public void cost() {
		System.out.println("Bike cost 100000");
	}

	@Override
	public void speed() {
		System.out.println("car speed 150");
		
	}
	public static void main(String[] args) { 
	Interface2 i=new Interface2();
	i.cost();
	i.speed();
}
	
}
