package myExample.lambda;

public class Lambda {
    public static void main(String[] args) {
        int c = 5;
        MyNumber number = (n) -> {
            double result = c * n;
            return result;
        };
        System.out.println(number.getNumber(5));

        number = (n) -> Math.random() * n;
        System.out.println("Рандомное число = " + number.getNumber(10));

        System.out.println("Рандомное число = " + number.getNumber(10));
        BooleantTest bt = (n) -> (n % 2) == 0;
        if(bt.mod(10))
            System.out.println("10 Четное число");
    }
}
interface MyNumber {
    double getNumber(int n);
}
interface BooleantTest {
    boolean mod(int n);
}