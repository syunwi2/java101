# 32 Java Collections Framework

# 컬레션 API

java.util package가 제공하는 자료구조 인터페이스이다.

Map계열을 제외하고는 Collection 인터페이스를 상속받는다.

## 특징

1. 하나의 변수에 여러 데이터를 저장할 수 있다.
2. 여러 데이터 타입을 저장할 수 있다.
    
    단, 참조형 데이터만 저장할 수 있다.
    
    → 기본형은 Wrapper 클래스로 저장
    
3. 선언 이후에 크기를 변경할 수 있다.
    
    → 추가, 삽입, 삭제 가능
    
4. 데이터 사용 여부에 따라 자료구조가 달라진다
    
    → 배열과 달리 링크드 리스트, 트리 등의 다양한 자료구조 사용
    

## [[암기] 컬렉션 프레임워크 계층 구조](https://www.falkhausen.de/Java-8/java.util/Collection-Hierarchy.html)

![Untitled](32%20Java%20Collections%20Framework%204a6fed5fdb4247ad91745ce319d12d08/Untitled.png)

![Untitled](32%20Java%20Collections%20Framework%204a6fed5fdb4247ad91745ce319d12d08/Untitled%201.png)

![Untitled](32%20Java%20Collections%20Framework%204a6fed5fdb4247ad91745ce319d12d08/Untitled%202.png)

[*) AbstractCollection in Java](https://www.geeksforgeeks.org/abstractcollection-in-java-with-examples/)

# Set

`public interface Set extends Collection`

![Untitled](32%20Java%20Collections%20Framework%204a6fed5fdb4247ad91745ce319d12d08/Untitled%203.png)

집합

순서가 없고 중복을 허용하지 않는 객체의 모임

탐색이 비효율적(무조건 모두 탐색, 시간 복잡도 최악)이지만 하나의 요소만 저장됨을 보장한다.

- Set을 상속한 하위 인터페이스
    - SortedSet (extends Set)
        
        요소가 정렬된 Set
        
    - NavigableSet (extends Sorted Set)
        
        순회할 수 있는 SortedSet
        

Set은 수학의 집합을 인터페이스로 구현한 것으로, 합집합, 교집합, 차집합을 구하기 위한 메서드를 제공한다.

- 합집합
    
    `A.addAll(B);`
    
- 교집합
    
    `A.retainAll(B);`
    
- 차집합
    
    `A.removeAll(B);`
    

## [HashSet](https://www.codelatte.io/courses/java_programming_basic/51BDPYQYSJVHNR4R)

```
public class HashSet<E> extends AbstractSet<E>
												implements Serializable, Cloneable, Iterable<E>,
																	 Collection<E>, Set<E>
```

Hash Table 기반으로 집합을 구현한 인터페이스이다.

→ 내부적으로 HashMap을 사용해 데이터를 저장한다.

→ Map의 키값이 유일해야 한다는 특성을 이용해 구현된 인터페이스이다.

key는 Set의 값으로 저장하고, value에는 더미 객체를 추가한다.

null 요소를 추가할 수 있다.

→ 중복 요소는 없으므로 단 하나의 null값이 존재 가능

## LinkedHashSet

```
public class LinkedHashSet<E> extends HashSet<E>
															implements Serializable, Cloneable, Iterable<E>,
																				 Collection<E>, Set<E>
```

요소의 순서가 보장되는 HashSet (extends HashSet)

→ 내부적으로 LinkedHashMap을 사용해 데이터를 저장한다.

→ 이중 연결 리스트로 요소들을 연결해 순서를 보장한다.

> HashSet을 사용했는데 어떻게 HashMap이 아닌 LinkedHashMap을 이용하는가?
> 
> - HashSet의 생성자
>     
>     ```java
>     // TreeSet의 생성자
>     public TreeSet() {
>         this(new TreeMap<E, Object>());
>     }
>     ```
>     
> - LinkedHashSet의 생성자
>     
>     ```java
>     // LinkedHashSet의 생성자
>     public LinkedHashSet() {
>         super(16, .75f, true);
>     }
>     // HashSet의 오버로딩 생성자
>     HashSet(int initialCapacity, float loadFactor, boolean dummy {
>         map = new LinkedHashMap<>(initialCapacity, loadFactor)
>     }
>     ```
>     
>     super 키워드를 이용해 LinkedHashMap 인스턴드를 반환하는 오버로딩 생성자를 호출한다.
>     

## TreeSet

```
public class TreeSet<E> extends AbstractSet<E>
												implements Serializable, Cloneable, Iterable<E>,
																	 Collection<E>, NavigableSet<E>, Set<E>,
																	 SortedSet<E>
```

Tree 기반으로 집합을 구현한 인터페이스이다.

→ 내부적으로 TreeMap을 사용해 데이터를 저장한다.

→ Map의 키값이 유일해야 한다는 특성을 이용해 구현된 인터페이스이다.

key는 Set의 값으로 저장하고, value에는 더미 객체를 추가한다.

null 요소를 추가할 수 있다.

→ 중복 요소는 없으므로 단 하나의 null값이 존재 가능

![Untitled](32%20Java%20Collections%20Framework%204a6fed5fdb4247ad91745ce319d12d08/Untitled%204.png)

### EnumSet

```
public class EnumSet<E> extends AbstractSet<E>
												implements Serializable, Cloneable, Iterable<E>,
																	 Collection<E>, Set<E>
```

HashSet보다 빠르다.

null 요소를 추가할 수 없다.

# [List](https://www.falkhausen.de/Java-8/java.util/Collection-List.html)

`public interface List<E> extends Collection<E>`

![Untitled](32%20Java%20Collections%20Framework%204a6fed5fdb4247ad91745ce319d12d08/Untitled%205.png)

순서가 있고 요소 간 중복을 허용한다.

탐색이 보다 효율적(엔덱스 이용, binarySearch 이용)이고 일반 배열보다 유동적인 사용이 가능(크기 변경 가능)하다.

- AbstractList 계열
    - ArrayList
    - AbstractSequentialList 계열
        - LinkedList
    - Vector 계열
        - Stack
- CopyInWriteArrayList 계열

## ArrayList

```
public class ArrayList<E> extends AbstractList<E>
													implements Serializable, Cloneable, Iterable<E>,
																		 Collection<E>, List<E>, RandomAccess
```

일반 배열보다 동작이 느리지만 동적 배열의 기능을 사용할 수 있다.

**기본형은 Wrapper 클래스를 이용해 사용한다.**

인덱스를 사용할 수 있다.

thread에서의 동기화를 보장하지 않는다.

→ 동기화가 필요하다면

Vector 클래스 등을 이용한다.

## LinkedList

```
public class LinkedList<E> extends AbstractSequentialList<E>
													 implements Serializable, Cloneable, Iterable<E>,
																		  Collection<E>, Deque<E>, List<E>, Queue<E>
```

링크드 리스트 자료구조를 구현한 클래스이다.

내부적으로 노드들을 이중 연결 리스트로 저장한다.

## Vector

```
public class Vector<E> extends AbstractSequentialList<E>
											 implements Serializable, Cloneable, Iterable<E>,
																	Collection<E>, List<E>, RandomAccess
```

동기화를 보장한다.

### Stack

```
public class Stack<E> extends Vector<E>
											implements Serializable, Cloneable, Iterable<E>,
																 Collection<E>, List<E>, RandomAccess
```

스택 자료 구조를 구현힌 클래스이다.

Vactor 클래스를 상속했기에 동기화 보장을 위한 오버헤드가 발생한다.

싱글 스레드 환경에서는 ArrayDeque 클래스를 사용하는 것이 성능에 도움이 된다.

# [Map](https://www.falkhausen.de/Java-8/java.util/Map-Hierarchy.html)

`public interface Map<K, V>`

![Untitled](32%20Java%20Collections%20Framework%204a6fed5fdb4247ad91745ce319d12d08/Untitled%206.png)

Collection 인터페이스를 상속하지 않는다.

HashTable 자료구조를 인터페이스로 정의한 것이다.

키와 데이터를 쌍으로 저장하고, 데이터를 얻을 때는 키를 이용한다.

중복된 키는 허용하지 않는다.

하나의 키는 최대 하나의 값을 가진다.

키를 알고 있는 경우 탐색 속도가 가장 빠르다.

- Map 인터페이스 계열
    
    HashTable(extends Dictionary implements Map)
    
    - AbstractMap 클래스 계열
        
        HashMap, LinkedHashMap, EnumMap
        
    - SortedMap 계열
        
        TreeMap
        

> ## HashTable 자료구조
> 
> 
> 해시 테이블 자료구조는 키와 값의 쌍으로 데이터를 저장한다.
> 
> ### 해시 테이블과 값의 저장
> 
> 1. 테이블에 저장할 (key, value) 쌍
> 2. key를 해시 함수의 인자로 하여 인덱스 계산
>     - 해시 함수
>         
>         해시 테이블에서는 키값에 해시 함수를 적용해 고유한 인덱스를 생성하고, 이 인덱스를 탐색에 사용한다.
>         
>         해시 함수를 이용하면 키와 쌍인 값이 저장된 인덱스를 바로 얻을 수 있으므로 해시 테이블의 평균 시간 복잡도는 O(1)이다.
>         
>         인덱스를 구하기 위한 여러 해시 함수가 이미 알려져 있으므로 이를 사용할 수 있다.
>         
> 3. 해당 인덱스를 이용해 버킷(배열)에 value 저장
> 
> ### 해시 값 충돌
> 
> 서로 다른 키에 해시 함수를 적용해 얻은 인덱스가 같은 경우 해시 충돌이 일어났다고 한다.
> 
> - 분리 연결법
>     
>     해시 함수를 이용해 얻은 인덱스에 해당하는 노드 이후에 새로운 노드를 연결한다.
>     
>     테이블 확장이 필요없고 구현이 간단하다.
>     
>     데이터 수가 많아지면 전체 테이블의 효율이 감소한다.
>     
> - 개방 주소법
>     
>     추가적인 공간을 만들지 않고 현재 테이블의 빈 공간을 이용한다.
>     
>     - 선형 조사
>         
>         버킷을 고정폭만큼 이동해 비어있는 버킷에 데이터를 저장한다.
>         
>     - 제곱 조사
>         
>         버킷을 특정 값의 제곱만큼 이동해 비어있는 버킷에 데이터를 저장한다.
>         
>     - 이중 해싱 조사
>         
>         충돌이 난 인덱스 값에 해시 함수를 한 번 더 적용한다.
>         

## HashMap

```
public class HashMap<K,V> extends AbstractMap<K,V>
                          implements Map<K,V>, Cloneable, Serializable
```

링크드 리스트 기반으로 구현되었다.

키나 값이 null일 수 있다.

키는 중복될 수 없지만 값은 중복될 수 있다.

요소들 간에는 순서가 없다.

thread에서의 동기화를 보장하지 않는다.

→ 동기화가 필요하다면

1. ConcurrentHashMap, HashTable 클래스 등을 이용한다.
2. `Map m = Collections.synchronizedMap(new LinkedHashMap(...));`을 이용해 동기화된 Map 인스턴스를 얻는다.

## LinkedHashMap

```
public class LinkedHashMap<K,V> extends HashMap<K,V> implements Map<K,V>
```

요소들 간 순서가 존재하는 HashMap

## TreeMap

```
public class TreeMap<K,V> extends TreeMap<K,V>
                          implements Serializable, Cloneable, Map<K,V>,
                                     NavigableMap<K,V>, SortedMap<K,V>
```

Self-Balancing Binary Tree(Red-Blask Tree)를 기반으로 구현되었다.

→ 평균 시간 복잡도는 O(log n)

키 값이 null일 수 없다.

→ 값은 null일 수 있다.

요소들 간 순서가 존재한다.

thread에서의 동기화를 보장하지 않는다.

→ 동기화가 필요하다면

`SortedMap m = Collections.synchronizedSortedMap(new TreeMap(...));`을 이용해 동기화된 SortedMap 인스턴스를 얻는다.

## [HashTable](https://www.geeksforgeeks.org/differences-between-hashmap-and-hashtable-in-java/)

```
public class Hashtable<K,V> extends Dictionary<K,V>
														implements Serializable, Cloneable, Map<K,V>
```

![Untitled](32%20Java%20Collections%20Framework%204a6fed5fdb4247ad91745ce319d12d08/Untitled%207.png)

키나 값이 null일 수 없다.

Map 계열과 별개이기 때문에 다형성 방면에서 불리함이 있다.

동기화를 지원하기 때문에 Map 계열보다 느리다.

해시 값 충돌 해결에 분리 연결법을 사용한다.

# 순회

## 길이를 얻는 메서드

- 배열
    
    `arr.length;`
    
- 문자열
    
    `str.length();`
    
- 컬렉션
    
    `obj.size();`
    

## iterator

```java
Iterator ite = obj.iterator();
while(ite.hasNext()) {
    System.out.print(ite.next() + " ");
}
```