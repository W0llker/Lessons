package myExample.Lambda;

public class Lamda2 {
    static int result(D s, int[] n) {
        return s.sum(n);
    }
    public static void main(String[] args) {
        int[] list = { 4, 5, 7, 12};
        int a = result(StaticMethod::sum,list);
        System.out.println(a);
    }
}
class StaticMethod {
    static int sum(int[] n) {
        int result = 0;
        for(int i : n)
            result += i;
        return result;
    }
}
interface D {
    int sum(int[] n);
}
