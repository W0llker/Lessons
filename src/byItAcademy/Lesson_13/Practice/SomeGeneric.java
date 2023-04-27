package byItAcademy.Lesson_13.Practice;

public class SomeGeneric<T> {

    T entity;

    public  SomeGeneric(T t) {
        entity = t;
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }
    public void nameOfClass() {
        System.out.println(entity.getClass().getName());
    }

    @Override
    public String toString() {
        return "SomeGeneric{" +
                "entity=" + entity +
                '}';
    }
}
