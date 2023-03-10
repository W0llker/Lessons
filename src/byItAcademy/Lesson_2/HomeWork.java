package byItAcademy.Lesson_2;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите № задачи (1/2) или 0 для выхода");
            x = scanner.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Задание №1");
                    System.out.print("Введите A: ");
                    int a = scanner.nextInt();
                    System.out.print("Введите B: ");
                    int b = scanner.nextInt();
                    ternaryOperator(a,b);
                    break;
                case 2:
                    System.out.println("Задание №2");
                    incrementAndDecrement(5,2,6);
                    break;
                default:
                    System.out.println("Число не подходит ><");
                    System.out.println();

            }
        }while (x != 0);
    }
    static void ternaryOperator(int a, int b) {

        int c = ((a % b) != 0) ? (a % b) : (a / b);
        System.out.println("(1.1) Деление A на B: " + c);

        int c1 = (a == 0) ? b : (a / b);
        System.out.println("(1.2) A==0?: " + c1);

        int c2 = (a == -1) ? (a + b) : a * b;
        System.out.println("(1.3) A==-1?: " + c2);

        int c3 = ((a != 0) && (a > 1)) ? (b / a) : (a + b);
        System.out.println("(1.4) A!=0 и A>1?: " + c3);
    }
    static void incrementAndDecrement(int x, int y, int z) {
        int c = --x + ++y * z--;
        System.out.println("Вот так расставил c = --x + ++y * z--");
        System.out.println(String.format("X=%,d \nY=%,d \nZ=%,d \nC=%,d",x,y,z,c));
    }
}
