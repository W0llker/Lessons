package byItAcademy.Lesson_20.Lesson;

import java.util.Comparator;

public class City {
    private int id;
    private String name;
    private Long population;
    private Continent continent;

    public City(int id, String name, long population, Continent continent)  {
        this.id = id;
        this.name = name;
        this.population = population;
        this.continent = continent;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", continent=" + continent +
                '}';
    }
}
