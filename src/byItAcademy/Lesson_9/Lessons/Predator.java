package byItAcademy.Lesson_9.Lessons;

public abstract class Predator {
    private String inhabitancy;
    private int maxSpeed;
    private String color;

    public Predator() {

    }

    public Predator(String inhabitancy, int maxSpeed, String color) {
        this.inhabitancy = inhabitancy;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public abstract void hunt();

    public abstract void sounds();

    public abstract void run();

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Predator)) return false;
        Predator predator = (Predator) obj;
        return inhabitancy.equals(predator.getInhabitancy()) && maxSpeed == predator.getMaxSpeed() && color.equals(predator.getColor());
    }

    @Override
    public int hashCode() {
        return inhabitancy.hashCode() + maxSpeed * 10 + color.hashCode();
    }

    @Override
    public String toString() {
        return "inhabitancy='" + inhabitancy + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", color='" + color + '\'';
    }

    public String getInhabitancy() {
        return inhabitancy;
    }

    public void setInhabitancy(String inhabitancy) {
        this.inhabitancy = inhabitancy;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
