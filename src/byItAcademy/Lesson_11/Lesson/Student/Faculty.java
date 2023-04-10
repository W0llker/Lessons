package byItAcademy.Lesson_11.Lesson.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Faculty {
    private String nameFaculty;
    private List<Group> facultyList = new ArrayList<>();
    private IsActive isActive;

    public Faculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
        isActive = IsActive.NOTACTIVE;
    }

    public void addGroup(Group group) {
        facultyList.add(group);
    }

    public void cheakCountFaculte() {
        if (countStudentInFaculty() <= 20) {
            isNotActive();
        } else {
            isActive();
        }
    }

    private int countStudentInFaculty() {
        int count = 0;
        for (Group g : facultyList) {
            count += g.countStudent();
        }
        return count;
    }

    private void isActive() {
        isActive = IsActive.ACTIVE;
    }

    private void isNotActive() {
        isActive = IsActive.NOTACTIVE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(nameFaculty, faculty.nameFaculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameFaculty);
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "nameFaculty='" + nameFaculty + '\'' +
                ", groupList=" + facultyList +
                '}';
    }
}
