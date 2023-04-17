package string;

import java.util.Arrays;
import java.util.Objects;

public class StringTest {

	public static void main(String[] args) {
		String s1 = new String(" Hello");
		String s2 = new String(" Hello");
		String s3 = "Hello";
		String s4 = "Hello";
		
		// comparator
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
		// instance method
		System.out.println(s1.length());
		System.out.println(s1.charAt(4));
		System.out.println(s1.substring(1, 3));
		System.out.println(s1.trim());
		System.out.println(s1.indexOf("l"));
		System.out.println(s1.indexOf("a"));
		System.out.println(s1.concat(" World"));
		System.out.println(s1.equalsIgnoreCase(" hElLo"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.contains("el"));
		System.out.println(s1.contains("lll"));
		System.out.println(s1.replace('o', ' '));
		
		// to character array
		char[] arr1 = s1.toCharArray();
		System.out.println(Arrays.toString(arr1));
		
		// to string array
		String s5 = "2023/04/17";
		String[] arr2 = s5.split("/");
		System.out.println(Arrays.toString(arr2));
		
		// static method of String Class
		System.out.println(String.valueOf(10));
		System.out.println(String.valueOf(3.14));
		System.out.println(String.valueOf(new char[] {'A', 'B'}));
		
		// origin string is not changed, new string is made for return value
		System.out.println(s1);
	}

}
