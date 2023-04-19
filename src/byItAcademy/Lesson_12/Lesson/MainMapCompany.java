package byItAcademy.Lesson_12.Lesson;

import java.util.ArrayList;
import java.util.List;
/*
3.	Создать класс Фирма. Создать класс Налоговая.
3.1	Поля у фирмы. Наименование, сфера деятельности, идентификационный номер. Долг перед налоговой
3.2	В классе налоговой создать поле типа HashMap(String, Collection<Фирма>>.
3.3	Создать десять фирм.
3.4	Добавить информацию о фирмах в налоговую со следующими ключами: Нет долгов, Не уплачено рублей до 10000,
не уплачено рублей более 10000.
3.5	Создать методов, который после оплаты налога какой-нибудь фирмой проверял задолжность и перед налоговой,
и мог переместить эту фирму в другой статус (в соответствующий ключ).
 */
public class MainMapCompany {
    public static void main(String[] args) {
        List<Company> companyList = new ArrayList<>();
        companyList.add(new Company("ГПО","Морепродукты","14GP",200));
        companyList.add(new Company("CVP","Фрукты","12СЗ",0));
        companyList.add(new Company("GPN","Морепродукты","14GP",2000));
        companyList.add(new Company("DFS","Морепродукты","14GP",0));
        companyList.add(new Company("AXC","Морепродукты","14GP",500));
        companyList.add(new Company("ART","Морепродукты","14GP",20000));
        companyList.add(new Company("QEP","Морепродукты","14GP",350));
        companyList.add(new Company("BNV","Морепродукты","14GP",0));
        companyList.add(new Company("LKD","Морепродукты","14GP",50000));

        Inspection inspection = new Inspection();
        inspection.addMap(companyList);
        companyList.get(0).setCreditInInspection(200);
        inspection.updateMap(companyList);
        inspection.information();
    }
}
