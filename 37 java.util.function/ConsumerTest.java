package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		/*
		 * java.util.function.Consumer
		 * 
		 * Consumer<T>: void accept(T t)
		 * 
		 * IntConsumer: void accept(int t)
		 * LongConsumer: void accept(long t)
		 * DoubleConsumer: void accept(double t)
		 * 
		 * BiConsumer<T, U>: void accept(T t, U u)
		 * 
		 * ObjIntBiConsumer<T, U>: void accept(T t, int u)
		 * ObjLongBiConsumer<T, U>: void accept(T t, long u)
		 * ObjDoubleBiConsumer<T, U>: void accept(T t, double u)
		 */
		
		Consumer<String> c1 = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println("Consumer: " + t);
			}
		};

		c1.accept("hello");
		
		Consumer<String> c2 = t -> System.out.println("Consumer: " + t);

		c2.accept("world");
		
		BiConsumer<String, String> b1 = new BiConsumer<String, String>() {
			@Override
			public void accept(String t, String u) {
				System.out.println("Biconsumer: " + t + " " + u);
			}
		};
		
		BiConsumer<String, String> b2 = (t, u) -> {
			System.out.println("Biconsumer: " + t + " " + u);
		};
	}

}
