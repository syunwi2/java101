# 12 java.util.Arrays

# Arrays.toString

배열 내 모든 원소를 [ele1, ele2, … ]형식의 문자열로 반환한다.

```java
int[] n = {1, 2, 3};
String[] s = {"A", "B"};
		
System.out.println(Arrays.toString(n));
System.out.println(Arrays.toString(s));

// [1, 2, 3]
/// [A, B]
```

# Arrays.fill

배열 내 일부 혹은 모든 원소를 특정 값으로 변경한다.

```java
Arrays.fill(s, "X");
System.out.println(Arrays.toString(s));
// [X, X]
Arrays.fill(n, 0, 1, 7);
System.out.println(Arrays.toString(n));
// [7, 2, 3]
```

- `Arrays.fill(Array, fromidx. toidx, var)`
    
    toidx는 범위에 포함되지 않는다.
    

# Arrays.equals

두 배열의 원소들이 같은지 검사한다.

```java
int[] n2 = {7, 2, 3};
System.out.println(Arrays.equals(n, n2));
// true
```

# Arrays.sort

배열의 원소들을 순차정렬한다.

```java
Arrays.sort(n);
System.out.println(Arrays.toString(n));
// [2, 3, 7]
```

# Arrays.binarySearch

이진 탐색을 기반으로 어떤 원소의 인덱스 값을 반환한다.

반드시 정렬 후 사용한다.

```java
int[] k2 = {54, 2, 1, 57, 9, 74};
System.out.println(Arrays.binarySearch(k2, 2));
// -4
Arrays.sort(k2);
System.out.println(Arrays.binarySearch(k2, 2));
// 1
```

# Arrays.copyOf

```java
int[] y = {1, 2, 3};
y = Arrays.copyOf(y, 5);
System.out.println(Arrays.toString(y));
// [1, 2, 3, 0, 0]
```

# Arrays.asList

개별적인 값들을 컬렉션 API(List)로 생성

```java
List<String> list = Arrays.asList("A", "b");
System.out.println(list);
// [A, b]
```

---

# List<Object>

- [Java Collection Framework](https://st-lab.tistory.com/142)
- [Java List Interface](https://st-lab.tistory.com/146)
- [List<Object> = new List<Object>() ?](https://luna-lua.tistory.com/entry/Java-ListObject-list-new-ListObject-%EC%95%88%EB%90%98%EB%8A%94-%EC%9D%B4%EC%9C%A0?category=1003350)
- [Arrays.asList(arr)의 반환값](https://m.blog.naver.com/roropoly1/221140156345)