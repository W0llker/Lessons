package byItAcademy.Lesson_12.Lesson;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Inspection {
    private Map<String, List<Company>> map = new HashMap();

    public void addMap(List<Company> list) {
        map.put("Долгов нету", zeroCredit(list));
        map.put("Не уплачено рублей до 10000", tenThousandCredit(list));
        map.put("не уплачено рублей более 10000", tensThousandCredit(list));
    }
    public void updateMap(List<Company> list) {
        addMap(list);
    }

    private List<Company> zeroCredit(List<Company> list) {
        List<Company> newList = new ArrayList<>();
        for (Company company : list) {
            if (company.getCreditInInspection() == 0) {
                newList.add(company);
            }
        }
        return newList;
    }
    private List<Company> tenThousandCredit(List<Company> list) {
        List<Company> newList = new ArrayList<>();
        for (Company company : list) {
            if (company.getCreditInInspection() < 10000 && company.getCreditInInspection() > 0) {
                newList.add(company);
            }
        }
        return newList;
    }
    private List<Company> tensThousandCredit(List<Company> list) {
        List<Company> newList = new ArrayList<>();
        for (Company company : list) {
            if (company.getCreditInInspection() > 10000) {
                newList.add(company);
            }
        }
        return newList;
    }
    public void information() {
        Set<Map.Entry<String,List<Company>>> entrySet = map.entrySet();
        for (Map.Entry<String,List<Company>> map : entrySet) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
    @Override
    public String toString() {
        return "Inspection{" +
                "map=" + map +
                "}";
    }
}
