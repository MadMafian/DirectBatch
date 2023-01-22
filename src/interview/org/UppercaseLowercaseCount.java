package interview.org;

public class UppercaseLowercaseCount {
	public static void main(String[] args) {
		String s="MaD14M@thi%3";
		int upper=0,lower=0,number=0,special=0;
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (Character.isUpperCase(c)) {
				upper++;
			}
			else if (Character.isLowerCase(c)) {
				lower++;
			}
			else if (Character.isDigit(c)) {
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
