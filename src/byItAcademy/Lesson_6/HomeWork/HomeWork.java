package byItAcademy.Lesson_6.HomeWork;

import byItAcademy.Lesson_6.Practice.Student;

import java.util.Arrays;

public class HomeWork {
    /*
2. Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты, Диагноз.
Создать массив объектов. Вывести:
a) список пациентов, имеющих данный диагноз;
b) список пациентов, номер медицинской карты которых находится в заданном интервале.
     */
    public static void main(String[] args) {
        Patient[] patientsTest = initialization();
        Patient[] patientsDiagnosis = new HomeWork().findPatientsDiagnosis(patientsTest, "Голова");
        Patient[] patientsNumberCard = new HomeWork().findPatientsNumberCard(patientsTest,12,129);
        System.out.println("Вывод пациентов с диагнозом Голова");
        System.out.println(Arrays.toString(patientsDiagnosis));
        System.out.println("\nВывод пациентов по медкарте в заданном диапазоне 12<x<129");
        System.out.println(Arrays.toString(patientsNumberCard));
    }

    public static Patient[] initialization() {
        Patient[] patients = new Patient[5];
        patients[0] = new Patient(0, "Никита", "Вдовенков", "Михайлович", "Проспект д3", "+375294586234", 135, "Нога");
        patients[1] = new Patient(0, "Кирилл", "Суворов", "Карычев", "Проспект д31", "+375294526234", 24, "Голова");
        patients[2] = new Patient(0, "Мария", "Огурцова", "Олеговна", "Проспект д34", "+375294186234", 35, "Нога");
        patients[3] = new Patient(0, "Света", "Блабла", "Сергеевна", "Проспект д15", "+375294766234", 105, "Нога");
        patients[4] = new Patient(0, "Вася", "Васькин", "Хз", "Проспект д2", "+375294586434", 1, "Голова");
        return patients;
    }

    public Patient[] findPatientsDiagnosis(Patient[] pat, String diagnosis) {
        int j = 0;
        for (Patient p : pat) {
            if (p.getDiagnosis().equals(diagnosis)) j++;
        }
        Patient[] patients = new Patient[j];
        j = 0;
        for (Patient p : pat) {
            if (p.getDiagnosis().equals(diagnosis)) {
                patients[j] = p;
                j++;
            }
        }
        return patients;
    }

    public Patient[] findPatientsNumberCard(Patient[] pat, int firdIndex, int lastIndex) {
        int j = 0;
        for (Patient p : pat) {
            if (p.getNumberMedCards() > firdIndex && p.getNumberMedCards() < lastIndex) j++;
        }
        Patient[] patients = new Patient[j];
        j = 0;
        for (Patient p : pat) {
            if (p.getNumberMedCards() > firdIndex && p.getNumberMedCards() < lastIndex) {
                patients[j] = p;
                j++;
            }
        }
        return patients;
    }
}
