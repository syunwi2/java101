package abstractClass;

public class MyConcreateClass extends MyAbstractClass {
	
	public MyConcreateClass() {}
	public MyConcreateClass(String str, int num) {
		super(str, num);
	}

	@Override
	public void printInfo() {
		System.out.println(this.getClass() + "." + this.str + "." + this.num);
	}

}
