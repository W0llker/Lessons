package byItAcademy.Lesson_11.Lesson.Hospital;

/*
2. Создать класс пациент, палата, отделение.
2.1 У пациента поля: уникальный идентификатор, имя, фамилия, диагноз, возраст, пол (сделать enum класс: Мужской, Женский).
2.2 У палаты поля: номер, тип палаты (энам мужская или женская), список пациентов
2.3 У отделения поля: наименование отделения, список палат (коллекция set)
2.4 Создать пациентов. Распределить их по палатам. В одной палате по 3 пациента максимум.
2.5. Сортировать пациентов по идентификационному номеру.
2.6 Посчитать количество мужчин и женщин в отделении.
2.7 Реализовать метод добавления пациента в палату на основе диагноза.
Т.е, в палате должны лежать пациенты с одинаковыми диагнозами.
 */
public class Main {
    public static void main(String[] args) {
        Ward ward1 = new Ward(32, Gender.Female);
        ward1.addPatients(new Patient("Алина", "Ветренная", "Ветрянка", 7, Gender.Female));
        ward1.addPatients(new Patient("Ира", "Гррр", "Асма", 16, Gender.Female));
        ward1.addPatients(new Patient("Олег", "Шишков", "Асма", 20, Gender.Male));
        ward1.addPatients(new Patient("Настя", "Шрек", "Асма", 15, Gender.Female));

        Ward ward2 = new Ward(356, Gender.Male, "Асма");
        ward2.addPatients(new Patient("Саня", "Кутузов", "Асма", 15, Gender.Male));
        ward2.addPatients(new Patient("Настя", "Шрек", "Асма", 15, Gender.Female));
        ward2.addPatients(new Patient("Антон", "Штейн", "Что то с спиной", 15, Gender.Male));
        ward2.addPatients(new Patient("Олег", "Шишков", "Асма", 20, Gender.Male));
        System.out.println(ward2);
        ward2.sortedNumberId();
        System.out.println(ward2);

        Department department = new Department("Штымп");
        department.addWards(ward1);
        department.addWards(ward2);
        department.countMaleOrFamele();
    }
}
