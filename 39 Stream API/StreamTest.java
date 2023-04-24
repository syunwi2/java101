package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		// ===== 스트림 생성 =====
		// class stream
		String[] names = {"Amy", "Amy", "Ben", "Cathy"};
		
		Stream<String> stream = Arrays.stream(names);
		Consumer<String> strOut1 = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		stream.forEach(strOut1);
		System.out.println();
		
		stream = Arrays.stream(names);
		Consumer<String> strOut2 = t -> System.out.println(t);	
		stream.forEach(strOut2);
		System.out.println();
		
		stream = Arrays.stream(names);
		stream.forEach(System.out::println);
		System.out.println();

		// JCF stream
		List<String> list = Arrays.asList(names);
		
		Stream<String> stream2 = list.stream();
		stream2.forEach(System.out::println);
		System.out.println();
		
		// ===== 중간 처리 =====
		// 중복 제거
		stream2 = list.stream();
		
		stream2.distinct().forEach(System.out::println);
		System.out.println();
		
		// 필터링
		stream2 = list.stream();
		
		Predicate<String> isStartsWithA = t -> t.startsWith("A");
		stream2.filter(isStartsWithA).forEach(System.out::println);
		System.out.println();
		
		// 정렬
		stream2 = list.stream();
		
		stream2.sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println();
		
		// 개수 제한
		stream2 = list.stream();
		
		stream2.limit(2).forEach(System.out::println);
		System.out.println();
		
		// 건너 뛰기
		stream2 = list.stream();
		
		stream2.skip(2).forEach(System.out::println);
		System.out.println();
		
		// wrapping
		int[] array = {1, 2, 3, 4};
		IntStream stream3 = Arrays.stream(array);
		
		stream3.boxed().forEach(t -> System.out.println(t instanceof Integer));
		System.out.println();

		// map()
		stream2 = list.stream();
		
		Function<String, Integer> getIndex1 = new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return t.length();
			}
			
		};
		Function<String, Integer> geyIndex2 = t -> t.length();
		Function<String, Integer> getIndex3 = String::length;
		
		stream2.map(getIndex3).forEach(System.out::println);
		System.out.println();
		
		// flatMap(): 1:n으로 매핑
		List<String> str = Arrays.asList("1/2/3/4");
		Stream<String> stream5 = str.stream();
		
		Function<String, Stream<String>> trimmer = new Function<String, Stream<String>>() {
			@Override
			public Stream<String> apply(String t) {
				String[] s = t.split("/");
				return Arrays.stream(s);
			}
		};
		
		stream5.flatMap(trimmer).forEach(System.out::println);
		System.out.println();
		
		// mapToInt()
		stream2 = list.stream();
		stream2.mapToInt(String::length).forEach(System.out::println);
		System.out.println();
		
		// ===== 최종 처리 =====
		// sum(), count(), max(), min(), average()
		List<Integer> xyz = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> stream6 = xyz.stream();
		
		// count()
		long count = stream6.count();
		System.out.println("xyz count : " + count);
		stream6 = xyz.stream();
		count = stream6.filter(t -> t % 2 == 0).count();
		System.out.println("xyz even num count : " + count);
		System.out.println();
		
		// sum()
		stream6 = xyz.stream();
		int sum = stream6.mapToInt(t -> t).sum();
		System.out.println("xyz sum: " + sum);
		System.out.println();
		
		// average()
		// OptionalDouble: 값이 없을 때 에외가 발생하지 않도록 해줌
		stream6 = xyz.stream();
		OptionalDouble avg = stream6.mapToInt(t -> t).average();
		System.out.println("xyz avg: " + avg.getAsDouble());
		
		List<Integer> xyz2 = Arrays.asList();
		stream6 = xyz2.stream();
		avg = stream6.mapToInt(t -> t).average();
		System.out.println("xyz2 avg: " + avg.orElse(0.0));
		System.out.println();
		
		// max()
		stream6 = xyz.stream();
		OptionalInt max = stream6.mapToInt(t -> t).max();
		System.out.println("xyz max: " + max.orElse(0));
		
		// min()
		stream6 = xyz.stream();
		OptionalInt min = stream6.mapToInt(t -> t).min();
		System.out.println("xyz min: " + min.orElse(0));
		System.out.println();
		
		// convert to List, Set, Map
		// to List: Collectors.toList()
		// to Set: Collectors.toSet()
		// to Map: Collectors.toMap(k, v)
		List<String> list2 = Arrays
				.stream(names)
				.filter(n -> n.length() > 2)
				.collect(Collectors.toList());
		System.out.println("to List: " + list2);
		
		Set<Integer> set = Arrays
				.stream(names)
				.map(n -> n.length())
				.collect(Collectors.toSet());
		System.out.println("to Set: " + set);
		
		Map<String, Integer> map = Arrays
				.stream(names)
				.distinct()
				.collect(Collectors.toMap(v -> v, v -> v.length()));
		System.out.println("to Map: " + map);
		System.out.println();
		
		// ===== 종합 =====
		// 각 배열 요소의 첫 3글자만 출력
		String[] arr = {"010-1234-1234", "011-1234-1234", "017-1234-1234"};
		Stream<String> stream4 = Arrays.stream(arr);
		
		stream4.map(t -> t.substring(0, 3)).forEach(System.out::println);
	}

}
