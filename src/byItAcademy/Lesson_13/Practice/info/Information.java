package byItAcademy.Lesson_13.Practice.info;

public class Information<K,V> {
    K key;
    V value;

    public Information(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Information{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
