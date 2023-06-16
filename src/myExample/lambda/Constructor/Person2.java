package myExample.lambda.Constructor;

public class Person2<T, V> {
    private T name;
    private V age;
    Person2() {

    }
    Person2(T name, V age) {
        this.name = name;
        this.age = age;
    }
    T getName() {
        return name;
    }
    V getAge() {
        return age;
    }
}
