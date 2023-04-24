# 37 java.util.function

![Untitled](37%20java%20util%20function%208fa79d9934f1458992eadee7589868b2/Untitled.png)

자바에서는 함수형 인터페이스를 더 편리하게 사용할 수 있는 API를 제공한다.

함수형 인터페이스를 사용할 때마다 매번 재정의하는 불편함을 없앨 수 있다.

# [시험] 함수 형태에 따른 패키지 종류

![Untitled](37%20java%20util%20function%208fa79d9934f1458992eadee7589868b2/Untitled%201.png)

## Runnable

`java.lang.Runnable`

```java
public interface Runnable {
    void run();
}
```

파라미터가 존재하지 않는다.

리턴값이 존재하지 않는다.

## Consumer

```java
public interface Consumer<T> {
    void accept(T t);

    default Consumer<T> andThen(Consumer<? super T> after) {
        Objects.requireNonNull(after);
        return (T t) -> { accept(t); after.accept(t); };
    }
}
```

파라미터가 존재한다.

리턴값이 존재하지 않는다.

## Supplier

```java
public interface Supplier<T> {
    T get();
}
```

파라미터가 존재하지 않는다.

리턴값이 존재한다.

## Function

```java
public interface Function<T, R> {
    R apply(T t);

    default <V> Function<V, R> compose(Function<? super V, ? extends T> before) {
        Objects.requireNonNull(before);
        return (V v) -> apply(before.apply(v));
    }

    default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (T t) -> after.apply(apply(t));
    }

    static <T> Function<T, T> identity() {
        return t -> t;
    }
}
```

파라미터가 존재한다.

리턴값이 존재한다.

파라미터와 리턴값의 데이터 타입은 일치하지 않을 수 있다.

## Operator

```java
public interface UnaryOperator<T> extends Function<T, T> {
    static <T> UnaryOperator<T> identity() {
        return t -> t;
    }
}
```

```java
public interface BinaryOperator<T> extends BiFunction<T, T, T> {
    static <T> BinaryOperator<T> maxBy(Comparator<? super T> comparator) {
        Objects.requireNonNull(comparator);
        return (a, b) -> comparator.compare(a, b) >= 0 ? a : b;
    }

    static <T> BinaryOperator<T> minBy(Comparator<? super T> comparator) {
        Objects.requireNonNull(comparator);
        return (a, b) -> comparator.compare(a, b) <= 0 ? a : b;
    }
}
```

파라미터가 존재한다.

리턴값이 존재한다.

파라미터와 리턴값의 데이터 타입은 일치해야 한다.

## Predicate

```java
public interface Predicate<T> {
    boolean test(T t);

    default Predicate<T> and(Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) && other.test(t);
    }

    default Predicate<T> negate() {
        return (t) -> !test(t);
    }

    default Predicate<T> or(Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) || other.test(t);
    }

    static <T> Predicate<T> isEqual(Object targetRef) {
        return (null == targetRef)? Objects::isNull : object -> targetRef.equals(object);
    }
}
```

파라미터가 존재한다.

리턴값이 존재한다.

리턴값의 데이터 타입은 boolean 타입이다.