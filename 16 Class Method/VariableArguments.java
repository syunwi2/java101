import java.util.Arrays;

class Test {
	public void a(int...a) {
		System.out.println(Arrays.toString(a));
	}
}

public class VariableArguments {

	public static void main(String[] args) {
		Test tst = new Test();
		
		tst.a(1, 2, 3, 4);

	}

}
