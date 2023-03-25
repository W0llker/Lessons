package byItAcademy.Lesson_6.HomeWork;

public class Patient {
    private int id;
    private String name;
    private String surname;
    private String middleName;
    private String address;
    private String mobilePhone;
    private int numberMedCards;
    private String diagnosis;
    public Patient() {

    }
    public Patient(int id, String name, String surname, String middleName, String address, String mobilePhone, int numberMedCards, String diagnosis) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.address = address;
        this.mobilePhone = mobilePhone;
        this.numberMedCards = numberMedCards;
        this.diagnosis = diagnosis;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setNumberMedCards(int numberMedCards) {
        this.numberMedCards = numberMedCards;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getNumberMedCards() {
        return numberMedCards;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", numberMedCards=" + numberMedCards +
                ", diagnosis='" + diagnosis + '\'' +
                "}\n";
    }
}
