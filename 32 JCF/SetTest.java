package jcf;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		HashSet set = new HashSet<>();
		
		// polymorphism
		Set<Object> s = new HashSet<Object>(); 

		set.add(10);
		set.add("Hello");
		set.add("Hello");
		
		// print elements with toString()
		System.out.println(set);
		
		// print elements with foreach
		for (Object x : set) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		// print elements with iterator
		Iterator ite = set.iterator();
		while(ite.hasNext()) {
			System.out.print(ite.next() + " ");
		}
		System.out.println();
		
		// helpful methods
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.contains(1));
		
		// remove
		set.remove(10);
		System.out.println(set);
		
		// reset
		set.clear();
		System.out.println(set);
	}

}
