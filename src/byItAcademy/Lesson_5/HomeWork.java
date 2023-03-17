package byItAcademy.Lesson_5;

public class HomeWork {
    /*
1. Создать массив из 10 элементов. Заполните массив рандомными числами и вывести их. Замените каждый элемент с нечётным индексом на ноль.
2. Создать массив вручную. Заменить максимальный и минимальный элемент массива.
3. Создать массив (вручную). Отсортировать элементы массива в порядке возрастания. Вывести полученный массив (решение можно подсмотреть с занятия). Выполнить с помощью цикла for
4. Создать массив (вручную). Отсортировать элементы массива в порядке возрастания. Вывести полученный массив. Выполнить с помощью цикла while
     */
    public static void main(String[] args) {
//        z1();
//        z2();
        z3();
    }

    public static void z1() {
        int[] a = {1, 15, 24, 14, 11, 34};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i] = 0;
            }
            System.out.print(a[i] + " ");
        }
    }

    public static void z2() {
        int[] a = {1, 15, 132, 14, 11, 34, 13, -32};
        int max = a[0], min = a[0];
        int m = 0, mr = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                m = i;
            }
            if (a[i] < min) {
                min = a[i];
                mr = i;
            }
        }
        System.out.println(max);
        a[m] = -1;
        a[mr] = -1;
        for (int c : a) {
            System.out.print(c + " ");
        }
    }

    public static void z3() {
        int[] a = {5, 2, 1, 45, -24, 125, 24};
        int i = 0, j = 0;
        int key = 0;
        while (i < a.length) {
            j = 0;
            while (j < a.length) {
                if (a[i] < a[j]) {
                    key = a[j];
                    a[j] = a[i];
                    a[i] = key;
                }
                j++;
            }
            i++;
        }
        for (int z : a) {
            System.out.print(z + " ");
        }
    }
}
