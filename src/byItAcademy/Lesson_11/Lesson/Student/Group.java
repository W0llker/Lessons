package byItAcademy.Lesson_11.Lesson.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Group {
    private String numberGroup;
    private List<Student> studentList = new ArrayList<>();

    public Group(String numberGroup) {
        this.numberGroup = numberGroup;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void cheackGroupNumber(Group group) {
        if (group.countStudent() <= 2) {
            this.studentList.addAll(group.studentList);
            group.studentList.clear();
        }
    }

    public void checkingAverageScore(Student student) {
        if (studentList.contains(student)) {
            if (student.getEvaluations() < 4) {
                studentList.remove(student);
            }
        } else {
            System.out.println("В группе нету такого студента");
        }
    }

    public List<Student> sortedStrudentUp() {
        List<Student> students = studentList;
        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < students.size(); j++) {
                if (students.get(i).getEvaluations() < students.get(j).getEvaluations()) {
                    Student s = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, s);
                }
            }
        }
        return students;
    }

    public List<Student> sortedStudentDown() {
        List<Student> students = studentList;
        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < students.size(); j++) {
                if (students.get(i).getEvaluations() > students.get(j).getEvaluations()) {
                    Student s = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, s);
                }
            }
        }
        return students;
    }

    public void studentAverageScore() {
        if (countStudent() > 0) {
            double score = 0;
            for (Student student : studentList) {
                score += student.getEvaluations();
            }
            System.out.println("Средний балл по группе= " + (score / studentList.size()));
        }
    }

    public int countStudent() {
        return studentList.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(numberGroup, group.numberGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberGroup);
    }

    public String getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(String numberGroup) {
        this.numberGroup = numberGroup;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "\nGroup{" +
                "numberGroup='" + numberGroup + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
