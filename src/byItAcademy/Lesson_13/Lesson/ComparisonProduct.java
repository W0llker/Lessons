package byItAcademy.Lesson_13.Lesson;

import java.util.Comparator;

public class ComparisonProduct<T extends Product,V extends Product> implements ComparatorMy<T,V>{
    T t;
    V v;

    public ComparisonProduct(T t, V v) {
        this.t = t;
        this.v = v;
    }
    public void information() {
        System.out.println(t.toString());
        System.out.println(v.toString());
    }
    public void compare(){
        if(t.getPrice() > v.getPrice()) {
            System.out.println(t.toString() + " дороже " + v.toString());
        } else if(v.getPrice() > t.getPrice()) {
            System.out.println(v.toString() + " дороже " + t.toString());
        }
        else System.out.println("Цена одинаковая");
    }
    @Override
    public boolean compareTo(T t, V v) {
        return t.getName().equals(v.getName());
    }
}
