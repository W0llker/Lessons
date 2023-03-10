package myExample.Collection;

import java.util.ArrayList;

public class ClassCollection {
    public static void main(String[] args) {
        ArrayList<People> arrayList = new ArrayList<>();
        arrayList.add(new People(25,"Федор"));
        arrayList.add(new People(14,"Вася"));
        for (People p : arrayList) {
            System.out.println(p);
        }
    }
}
class People {
    private int age;
    private String firstName;
    public People(){

    }
    public People(int age, String firstName) {
        this.age = age;
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return firstName + " " + age;
    }
}
