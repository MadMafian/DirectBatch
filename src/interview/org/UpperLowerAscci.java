package interview.org;

public class UpperLowerAscci {
	public static void main(String[] args) {
		String s="MaD14M@thi%";
		int upper=0,lower=0,number=0,special=0;
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int x=c;
			if (x>=65 && x<=90) {
				upper++;
			}
			else if (x>=97 && x<=122) {
				lower++;
			}
			else if (x>=48 && x<=57) {
				number++;
			}
			else {
				special++;
			}
	}
		System.out.println("Upper Count "+upper);
		System.out.println("Lower Count "+lower);
		System.out.println("Number Count "+number);
		System.out.println("Special Count "+special);
}
}