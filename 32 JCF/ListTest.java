package jcf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// array
		// cannot append, insert, delete.
		MyClass[] arr0 = {
				new MyClass("a", 0),
				new MyClass("b", 1),
				new MyClass("c", 2)
		};
		
		for (MyClass myClass : arr0) {
			System.out.println(myClass + " ");
		}
		System.out.println(); 
		
		//List<MyClass> arr2 = Arrays.asList(new MyClass("a", 0),
		//								  new MyClass("b", 1),
		//								  new MyClass("c", 2));
		
		// ArrayList
		// can append, insert, delete
		List<MyClass> arr = new ArrayList<MyClass>();
		arr.add(new MyClass("a", 0));
		arr.add(new MyClass("b", 1));
		arr.add(new MyClass("c", 2));
		
		arr.add(new MyClass("d", 3));
		arr.add(0, new MyClass("x", -1));
		arr.remove(arr.size() - 1);
		
		System.out.println(arr);
		System.out.println();
		
		ArrayList<String> list = new ArrayList<String>();

		list.add("Merry");
		list.add("X-mas");
		list.add("and");
		list.add("Happy");
		list.add("new");
		list.add("year");
		
		System.out.println(list);
		
		for (String string : list) {
			System.out.print(string + " ");
		}
		System.out.println();
		
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			System.out.print(ite.next() + " ");
		}
		System.out.println();
		
		// using iterator with generic, casting is not needed.
		System.out.println(list.get(3).toLowerCase());
		System.out.println();
		
		// useful methods
		List<Integer> intList = new ArrayList<>();
		
		intList.add(10);
		intList.add(10);
		intList.add(10);
		
		System.out.println(intList.size());
		System.out.println(intList.isEmpty());
		System.out.println(intList.contains(20));
		System.out.println(intList.contains(10));
		System.out.println(intList.indexOf(10));
		
		Object[] obj = list.toArray();
		System.out.println(Arrays.asList(obj));
		
		System.out.println(intList.subList(1, 3));
	}

}
