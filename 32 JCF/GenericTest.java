package jcf;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GenericTest {
	
	public static void main(String[] args) {
		// without generic
		Set set0 = new HashSet();
		
		set0.add("Merry");
		set0.add("X-mas");
		set0.add("and");
		set0.add("Happy");
		set0.add(2023);
		
		for (Object object : set0) {
			// 1. Runtime Error occurs
			// 	  ClassCastException: java.lang.Integer cannot be cast to java.lang.String
			// 2. Casting is needed.
			
			// String str = (String)object;
			// System.out.print(str + " ");
		}
		System.out.println();
		
		// with generic
		Set<String> set = new HashSet<String>();
		
		set.add("Merry");
		set.add("X-mas");
		set.add("and");
		set.add("Happy");
		// 1. Compile Error occurs.
		//    The method add(String) in the type Set<String> is not applicable for the arguments (int)
		// set.add(2023);
		set.add("2023");
		
		for (String string : set) {
			// 2. Casting is not needed.
			System.out.print(string + " ");
		}
		System.out.println();
	}
}

