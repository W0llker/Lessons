package byItAcademy.Lesson_11.Lesson.Hospital;

import byItAcademy.Lesson_11.Lesson.Student.Student;

import java.util.ArrayList;
import java.util.List;

public class Ward {
    private int numbersWard;
    private Gender type;
    private String diagnosis;
    private List<Patient> patients = new ArrayList<>();

    public Ward(int numbersWard, Gender type) {
        this.numbersWard = numbersWard;
        this.type = type;
    }

    public Ward(int numbersWard, Gender type, String diagnosis) {
        this.numbersWard = numbersWard;
        this.type = type;
        this.diagnosis = diagnosis;
    }

    public void addPatients(Patient patient) {
        if (diagnosis == null) {
            if (patient.getGender() == type && countPatient() < 3) {
                patients.add(patient);
            }
        } else {
            addPatientsDiagnosis(patient);
        }
    }
    private void addPatientsDiagnosis(Patient patient) {
        if (patient.getDiagnosis().equals(diagnosis) && patient.getGender() == type && countPatient() < 3) {
            patients.add(patient);
        }
    }
    public void sortedNumberId() {
        List<Patient> patients1 = patients;
        for (int i = 0; i < patients1.size(); i++) {
            for (int j = 0; j < patients1.size(); j++) {
                if (patients1.get(i).getId() > patients1.get(j).getId()) {
                    Patient p = patients1.get(i);
                    patients1.set(i, patients1.get(j));
                    patients1.set(j, p);
                }
            }
        }
        patients = patients1;
    }
    public int countPatient() {
        return patients.size();
    }

    public int getNumbersWard() {
        return numbersWard;
    }

    public void setNumbersWard(int numbersWard) {
        this.numbersWard = numbersWard;
    }

    public Gender getType() {
        return type;
    }

    public void setType(Gender type) {
        this.type = type;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    @Override
    public String toString() {
        return "\nWard{" +
                "numbersWard=" + numbersWard +
                ", type=" + type +
                ", diagnosis='" + diagnosis + '\'' +
                ", patients=" + patients +
                '}';
    }
}
