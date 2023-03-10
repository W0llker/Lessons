package byItAcademy.Lesson_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести число А");
        int a = scanner.nextInt();
        System.out.println("Ввести число B");
        int b = scanner.nextInt();
        System.out.println("Ввести число C");
        int c = scanner.nextInt();
        int result;


        if(a > b) {
            result = a - b;
            System.out.println("Разность а - b = " + result);
        } else if (a == b) System.out.println("Сумма a и b = " + (a + b));
        else System.out.println("Разность b - a " + (b - a));


        if((a > b) && b != 0) {
            System.out.println("Деление a на b" + (a/b));
        } else if (a != 0) {
            System.out.println("Деление b на a = " + (b/a));
        }else System.out.println("Сумма " + (a + b));


        if (a%3 == 0) System.out.println("Число делится на 3");
        else System.out.println("Число не делится 3");


        if(((a % 3) == 0) && ((a % 7) == 0)) System.out.println("Число а делится на 3 и 7");
        else if ((a % 3) == 0) System.out.println("Число а делится на 3");
        else if ((a % 7) == 0) System.out.println("Число а делится на 7");
        else System.out.println("Число а не делится на 3 и 7");


        if ((a % 13) == 0) System.out.println("Число делится на 13");
        else System.out.println("Число не делится 13");


        if ((a > b) && (a > c)) {
            System.out.println("A Максимальное = " + a);
        } else if ((b > a) && (b > c)) {
            System.out.println("B Максимальное = " + b);
        } else if ((a == b)&&(b == c)) System.out.println("все числа одинаковы");
        else System.out.println("C Максимальное = " + c);


        if((a < b) && (a < c)) {
            System.out.println("A Минимальное = " + a);
        } else if ((b < a) && (b < c)) {
            System.out.println("B Минимальное = " + b);
        } else System.out.println("C Минимальное = " + c);


        result = 15 / a;
        switch (result) {
            case 3 -> System.out.println("Результат деления равен 3");
            case 5 -> System.out.println("Результат деления равен 5");
            default -> System.out.println("Результат деления равен дробному числу = " + ((double) 15 / a));

        }
        switch (result) {
            case 3:
                System.out.println("Результат деления равен 3");
                break;
            case 5:
                System.out.println("Результат деления равен 5");
                break;
            default:
                System.out.println("Результат деления равен дробному числу = " + ((double) 15 / a));
        }
    }
}
