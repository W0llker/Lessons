package byItAcademy.Lesson_2;

import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int x1 = 88/(10 + 12);
        System.out.println("x = " + x1);
        System.out.println("Задание 2");
        int z1 =(98 - 25)*6;
        System.out.println(z1);
        System.out.println("Задание 3");
        /*
        System.out.println("Введите x,y,z:");
        int x = scanner.nextInt(),y = scanner.nextInt(),z = scanner.nextInt();
        x+=5;
        y*=9;
        z-=6;
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("Z = " + z);
        */
        System.out.println("Задание 4");
        int x2 = 5, y1 = 2, c;
        c = x2++ * y1--;
        System.out.println("X = " + x2);
        System.out.println("C = " + c);
        System.out.println("Y = " + y1);

        System.out.println("Задание 5");
        double a = 50.25, b = 60.75, c3 = 110;
        System.out.println((a + b) % c3);

        System.out.println("Задание 6");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Z = ");
        int z = scanner.nextInt();
        System.out.print("Введите V = ");
        int v = scanner.nextInt();
        int k = z > v? 5 : 10;
        int k1 = z > v? z - v : v - z;
        System.out.println("Задание 6 = " + k);
        System.out.println("Задание 7 = " + k1);
    }
}
