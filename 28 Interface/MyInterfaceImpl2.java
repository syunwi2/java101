package interfaceAndClass;

import java.util.Collection;

public abstract class MyInterfaceImpl2 implements MyInterface {
	@Override
	// public default int c() {}    <- Error
	public int c() {
		return NUM * 10;
	}
	
	// @Override
	// public static void getInfo() {} <- Error
}
