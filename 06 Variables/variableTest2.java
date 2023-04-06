package p01;

public class variableTest2 {

	public static void main(String[] args) {
		// Data to store : name, age, address, height, weight, marriage status, gender
		String name = "Lee";
		int age = 30;
		String address = "seoul";
		float height = 160.7f;
		double weight = 50.3;
		boolean isMarried = false;
		char gender = 'f';
		
		System.out.printf("name: %s\nage: %d\naddr: %s\nh: %.2f\nw: %.2f\nisM: %b\ngen: %c", name, age, address, height, weight, isMarried, gender);
	}

}
