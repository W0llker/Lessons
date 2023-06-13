package byItAcademy.Lesson_23.Practice;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/*
Создать собственную аннотацию @AcademyInfo c полем year.
Создать метод, помеченный этой аннотацией с заданным year, и метод без нее.
С помощью рефлексии проверить наличие данной аннотации у этих методов из основной программы.

Создать собственную аннотацию @AcademyInfo c полем year.
Создать метод, помеченный этой аннотацией с заданным year, и метод без нее.
С помощью рефлексии проверить наличие данной аннотации у этих методов из основной программы.
 */
public class MainAnnotation {
    public static void main(String[] args) {
        getResultZadanie1();
        System.out.println("*********************");
        getResultZadanie2();
    }

    private static void getResultZadanie1() {
        try {
            Academy academy = new Academy();
            Class<?> ac = academy.getClass();
            Method[] methods = ac.getDeclaredMethods();
            int annotationYear = 0;
            for (Method method : methods) {
                Annotation[] annotations = method.getDeclaredAnnotations();
                for (Annotation annotation : annotations) {
                    if (annotation instanceof AcademyInfo) {
                        AcademyInfo academyInfo = (AcademyInfo) annotation;
                        annotationYear = academyInfo.year();
                    }
                }
                if (method.isAnnotationPresent(AcademyInfo.class)) {
                    System.out.println(annotationYear);
                    method.setAccessible(true);
                    method.invoke(academy);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void getResultZadanie2() {
        try {
            Service service = new Service();
            Class<?> serviceClass = service.getClass();
            Method[] methods = serviceClass.getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(Example.class)) {
                    method.setAccessible(true);
                    method.invoke(service);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
