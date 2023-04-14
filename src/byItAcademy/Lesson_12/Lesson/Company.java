package byItAcademy.Lesson_12.Lesson;

public class Company {
    private String nameCompany;
    private String activity;
    private String id;
    private int creditInInspection;

    public Company(String nameCompany, String activity, String id, int creditInInspection) {
        this.nameCompany = nameCompany;
        this.activity = activity;
        this.id = id;
        this.creditInInspection = creditInInspection;
    }
    public void payment(int payment) {
        creditInInspection = payment;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCreditInInspection() {
        return creditInInspection;
    }

    public void setCreditInInspection(int credit) {
        creditInInspection -= credit;
    }

    @Override
    public String toString() {
        return "\nCompany{" +
                "nameCompany='" + nameCompany + '\'' +
                ", activity='" + activity + '\'' +
                ", id='" + id + '\'' +
                ", creditInInspection=" + creditInInspection +
                "}";
    }
}
