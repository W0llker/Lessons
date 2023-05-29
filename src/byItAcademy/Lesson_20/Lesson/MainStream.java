package byItAcademy.Lesson_20.Lesson;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/*
3.	Создать класс Город. Поля id, имя города, население, континент (Enum)
3.1.	Создать города
3.2.	Найти самый густонаселённый город на континенте
3.3.	Найти город, с минимальным населением на континенте.
3.4.	Найти самый густонаселённый город
3.5.	Найти город с самым маленьким населением.
3.6.	Найти первый попавшиеся город, у которого население больше 1млн.
3.7.	Отобрать города с населением больше 1 млн.
3.8.	Отсортировать города по населению по возрастанию. По убыванию.
3.9.	Создать коллекцию из имён города
3.10.	 Посчитать среднее количество население среди всех городов.
3.11.	Проверить, есть ли город Осло в вашей коллекции
3.12.	Найти город Осло в коллекции и выбросить Exception, если такого нет. Exception выбрасывать свой.
 */
public class MainStream {
    public static void main(String[] args) {
        City city = new City(1, "1", 450, Continent.EUROPE);
        City city1 = new City(2, "2", 500, Continent.AFRICA);
        City city2 = new City(3, "3", 9000, Continent.AFRICA);
        City city3 = new City(4, "4", 5000, Continent.EUROPE);
        City city4 = new City(5, "5", 4500000, Continent.EUROPE);
        City city5 = new City(6, "6", 45000000, Continent.EUROPE);

        Collection<City> cities = List.of(city,city1,city2,city3,city4,city5);

        Optional<City> stream = cities.stream().filter(city6 -> city.getContinent() == Continent.EUROPE).min((e,e2)-> e.getPopulation().compareTo(e2.getPopulation()));
        System.out.println(stream.get());

        Optional<City> cityStream = cities.stream().filter((a) -> a.getPopulation() > 200000000).findFirst();
        if(cityStream.isPresent()) {
            System.out.println(cityStream.get());
        }else {
            System.out.println("Такого города нету");
        }

        Collection<City> sortedCity = cities.stream().sorted(Comparator.comparing(City::getPopulation).reversed()).toList();
        System.out.println(sortedCity);

    }
}
