package myExample.Lambda.Constructor;

public class Person {
    private String name;
    private int age;
    Person() {

    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    String getName() {
        return name;
    }
    int getAge() {
        return age;
    }
}