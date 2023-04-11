/*
 * Cat 클래스를 관리하는 클래스
 * 1. Cat 클래스를 메모리에 올림(객체 생성)
 * 		ClassName varName = new ClassName();
 * 
 * 2. Cat 정보를 저장
 */
public class TestCat {

	public static void main(String[] args) {
		// 1. declare class reference
		Cat momo;
		// momo.name = "momochan" <- Error, local variable needs to be initialized.

		// 2. create class instance
		momo = new Cat();

		// 3. initialize instance variables
		momo.name = "momochan";
		momo.age = 2;
		momo.sex = "f";

		// 4. another instance .. 
		Cat cheeze = new Cat("cheezechan", 1);
		cheeze.sex = "m";
		
		System.out.printf("Name of cat: %s\nAge of cat: %d\nSex of cat: %s\n", momo.name, momo.age, momo.sex);
		System.out.printf("Name of cat: %s\nAge of cat: %d\nSex of cat: %s\n", cheeze.name, cheeze.age, cheeze.sex);
	}

}
