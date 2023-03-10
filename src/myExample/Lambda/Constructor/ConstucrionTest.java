package myExample.Lambda.Constructor;
public class ConstucrionTest {
    static <T, V, C> T myPerconFactory(PersonFun<T, V, C> cons, V v, C c) {
        return cons.func(v,c);
    }

    public static void main(String[] args) {
        PersonFun<Person,String,Integer> personFun = Person::new;
        Person p1 = myPerconFactory(personFun,"Никита",20);
        System.out.println("Его зовут " + p1.getName() + " и лет ему " + p1.getAge());

        PersonFun<Person2<String, Integer>, String, Integer> personFun1 = Person2::new;
        Person2<String, Integer> p2 = myPerconFactory(personFun1,"Иван",33);
        System.out.println(p2.getAge() + " " + p2.getName());
    }
}