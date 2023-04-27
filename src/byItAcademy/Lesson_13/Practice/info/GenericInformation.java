package byItAcademy.Lesson_13.Practice.info;

import java.util.ArrayList;

public class GenericInformation {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"Кикита","Вдовенков");
        Employee employee1 = new Employee(2,"Soon","Памп");
        Employee employee2 = new Employee(3,"Саня","Кар");
        Student student = new Student(1,"Саня","Мажоров","Строительный");

        Information<Employee,String> information = new Information<>(employee,"Директор");
        Information<Student,Integer> integerInformation = new Information<>(student,5);

        PeopleList<Employee,String> peopleList = new PeopleList<>(new ArrayList<>());
        peopleList.addInformation(employee,"Директор");
        peopleList.addInformation(employee1,"Полицмен");
        peopleList.addInformation(employee2,"Повар");
        peopleList.informationToString();
    }
}
