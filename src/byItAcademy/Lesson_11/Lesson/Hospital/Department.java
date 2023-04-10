package byItAcademy.Lesson_11.Lesson.Hospital;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String nameDepartment;
    private List<Ward> wards = new ArrayList<>();

    public Department(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public void addWards(Ward ward) {
        if (ward != null) {
            wards.add(ward);
        }
    }

    public void countMaleOrFamele() {
        int male = 0;
        int famele = 0;
        for (Ward w : wards) {
            if (w.getType() == Gender.Male) {
                male += w.countPatient();
            } else famele += w.countPatient();
        }
        System.out.println("В отделение мужчин= " + male + ", а женщин= " + famele);
    }

    @Override
    public String toString() {
        return "Department{" +
                "nameDepartment='" + nameDepartment + '\'' +
                ", wards=" + wards +
                '}';
    }
}
