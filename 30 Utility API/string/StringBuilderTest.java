package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder(" Hello");
		StringBuffer buffer = new StringBuffer(" World");
		
		System.out.println(builder);
		System.out.println(buffer);
		System.out.println();
		
		StringBuilder x = new StringBuilder();
		
		// origin data is updated
		System.out.println(x.append("Hello"));
		System.out.println(x);
		System.out.println(x.append("World"));
		System.out.println(x);
		
		System.out.println(x.insert(5, " "));
		System.out.println(x.delete(5, x.length()));
		
		System.out.println(x.reverse());
		
		System.out.println(x.charAt(0));
		System.out.println(x.indexOf("H"));
		
		System.out.println(x.substring(1));
		System.out.println(x.substring(0, 3));
		
		// to String
		String s = x.toString();
		System.out.println(s);
	}

}
