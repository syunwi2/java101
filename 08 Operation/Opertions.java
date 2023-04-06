package p03;

public class Opertions {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 3;
		
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);
		System.out.println(n1 / (float)n2);
		System.out.println(n1 % n2);
		
		n1 += n2;
		System.out.println(n1 + " " + n2);
		n1 -= n2;
		System.out.println(n1 + " " + n2);
		n1 *= n2;
		System.out.println(n1 + " " + n2);
		n1 /= n2;
		System.out.println(n1 + " " + n2);
		
		System.out.println(1 == 2);
		System.out.println(1 != 2);
		System.out.println(1 < 2);
		System.out.println(1 <= 2);
		System.out.println(1 > 2);
		
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(!false);
		
		int num1 = 10;
		int num2 = 20;
		
		// Q. has num1 get vaule larger than 15 and num2 gets value smaller than 30?		
		System.out.println(num1 > 15 && num2 < 30);
		
		// Q. has num1 get vaule larger than 15 or num2 gets value smaller than 30?
		System.out.println(num1 > 15 || num2 < 30);
	}

}
