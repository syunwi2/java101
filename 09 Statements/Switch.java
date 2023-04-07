package p04;

public class Switch {

	public static void main(String[] args) {
		byte b = 10;
		// int b = 10;
		// short b = 10;
		// char b = 10;
		// String b = "10";
		// enum <- TBA
		
		// switch statements without break
		switch (b) {
		case 10: System.out.println("10");
		case 20: System.out.println("20");
		case 30: System.out.println("30");
		dafault: System.out.println("default");
		}
		// switch statement with break
		switch (b * 10) {
		case 100:
			System.out.println("100;");
			break;
		case 200:
			System.out.println("200;");
			break;
		case 300:
			System.out.println("300;");
			break;
		default:
			System.out.println("default.");
			break;
		}
	}

}
