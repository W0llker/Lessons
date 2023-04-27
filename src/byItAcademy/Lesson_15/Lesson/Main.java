package byItAcademy.Lesson_15.Lesson;

import java.io.*;
import java.sql.SQLOutput;

/*
1.1  Записать его в файл прописал относительный путь.
1.2  Записать его в файл прописав абсолютный путь.
1.3  Вычитать текст из первого файла.
1.4  Вычитать текст из второго файла
2.1  Создать объект Автомобиль с соответствующими полями. Выполнить сериализацию объекта.
2.2  Выполнить десериализацию объекта.
 */
public class Main {
    public static void main(String[] args) {
        String s = "The Rostóvs knew everybody in Moscow. The old count had money enough that year, " +
                "as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, " +
                "very stylish riding breeches of the latest cut, such as no one else yet had in Moscow, and " +
                "boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his " +
                "time very gaily. After a short period of adapting himself to the old conditions of life, Nicholas" +
                " found it very pleasant to be at home again. He felt that he had grown up and matured very much." +
                " His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh" +
                " driver, his kissing Sónya on the sly—he now recalled all this as childishness he had left" +
                " immeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with silver, and " +
                "wearing the Cross of St. George, awarded to soldiers for bravery in action, and in the company " +
                "of well-known, elderly, and respected racing men was training a trotter of his own for a race." +
                " He knew a lady on one of the boulevards whom he visited of an evening. He led the mazurka at " +
                "the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, visited the English Club," +
                " and was on intimate terms with a colonel of forty to whom Denísov had introduced him.";
        saveText(s);
        saveText1(s);
        String z = loadText();
        System.out.println(z);
        String z1 = loadText1();
        System.out.println(z1);
        System.out.println("************************** CЕРИАЛИЗАЦИЯ И ДЕСЕРИАЛИЗАЦИЯ*********************************");
        saveCar(new Car("BMW", "X5"));
        Car car = loadCar();
        System.out.println(car);
    }

    public static void saveText(String s) {
        try (FileWriter writer = new FileWriter(new File("src/byItAcademy/Lesson_15/Lesson", "Text.txt"))) {
            writer.write(s);
            System.out.println("Файл сохранен");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveText1(String s) {
        try (FileWriter writer = new FileWriter(new File("D:\\IT_Academy\\Lessons\\src\\byItAcademy\\Lesson_15\\Lesson", "Text.txt"))) {
            writer.write(s);
            System.out.println("Файл сохранен");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String loadText() {
        File file = new File("D:\\IT_Academy\\Lessons\\src\\byItAcademy\\Lesson_15\\Lesson", "Text.txt");
        String result = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            if ((result = bufferedReader.readLine()) != null) {
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String loadText1() {
        File file = new File("src/byItAcademy/Lesson_15/Lesson", "Text.txt");
        String result = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            if ((result = bufferedReader.readLine()) != null) {
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void saveCar(Car car) {
        File file = new File("src/byItAcademy/Lesson_15/Lesson", "Serializable.txt");
        try (ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutput.writeObject(car);
            System.out.println("Обьект сохранен");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Car loadCar() {
        Car car = null;
        File file = new File("src/byItAcademy/Lesson_15/Lesson", "Serializable.txt");
        try (ObjectInputStream object = new ObjectInputStream(new FileInputStream(file))) {
            Object z = object.readObject();
            if (z instanceof Car) {
                car = (Car) z;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return car;
    }

}
