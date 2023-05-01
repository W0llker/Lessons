package byItAcademy.Lesson_16.Lesson.Thead;

import java.io.File;
import java.io.FileWriter;

/*
Создать класс поток, который создает средствами
Java файл и записать в него произвольно сгенерированный массив
из 10 случайных целых чисел. Запустить 5 потоков
 */
public class TheadFile implements Runnable {
    private String name;
    private File file;

    public TheadFile(String name) {
        this.name = name;
        file = new File("src/byItAcademy/Lesson_16/Lesson/Thead", name + ".txt");
    }

    @Override
    public void run() {
        int[] mass = new int[10];
        for (int i = 0; i < 10; i++) {
            mass[i] = (int) (Math.random() * 10);
        }
        try (FileWriter fileWriter = new FileWriter(file)) {
            for (int i : mass) {
                fileWriter.write(i + " ");
            }
            fileWriter.write("Поток " + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
