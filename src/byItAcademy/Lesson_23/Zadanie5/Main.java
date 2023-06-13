package byItAcademy.Lesson_23.Zadanie5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
5. Создать класс пациент.
У класса пациент поля (все String) Имя, фамилия, номер палаты, диагноз.
Создать 5 пациентов с заполненными полями.
С помощью рефлексии сделать динамически фильтр. Т.е., через сканер передавать имя поля по которому будет происходит фильтрация и его значение.
Саму фильтрацию выполнять через стримы.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Patient> patientList = List.of(new Patient("Никита", "Туткин", 1, "дурак"),
                new Patient("Cаня", "Туткин", 1, "дурак"),
                new Patient("Филл", "Тамп", 5, "дурак"),
                new Patient("Кар", "Хм", 2, "дурак"),
                new Patient("Иван", "Майский", 3, "дурак"));
        System.out.println("Введите поле по которому нужно сделать фильтр и значение");
        sortedPatient(patientList, scanner.next(), scanner.next());
    }

    private static void sortedPatient(List<Patient> patientList, String sortedField, String name) {
        List<Patient> patientsFilter = new ArrayList<>();
        Class<?> patientClass = Patient.class;
        Method[] methods = patientClass.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equals("get" + sortedField)) {
                patientsFilter = patientList.stream().filter(patient -> {
                    try {
                        return method.invoke(patient).equals(name);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                }).toList();
            }
        }
        System.out.println(patientsFilter);
    }
}
