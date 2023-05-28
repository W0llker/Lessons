package byItAcademy.Lesson_22.Practice;

import java.sql.SQLOutput;

/*
Смоделировать ситуацию оповещения населения о том, что «купание в нетрезвом виде опасно для жизни» от МЧС
Есть 4 оператора связи которые должны оповестить населении об опасности купания в нетрезвом виде (Velcom, Life, MTC, Белтелеком).
Класс МЧС, должен оповестить этих операторов связей, создав событие. В свою очередь операторы связи должны подписаться на создаваемые события от МЧС.
Каждый оператор связи при получении задания от МЧС должен сгенерировать свой текст. К примеру Velcom- Отправляет смски всем абонентам велком, Белтелеком-обзванивает всех абонентов белтелеком с информацией об опасности купания и т.д.
При этом должна оставаться возможность добавлять подписчиков на генерируемые события от мчс без изменения кода, так как могут на рынок прийти другие операторы связи со временем.
Класс мчс сделать синглотоном
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("****************Mes***************");
        Mes mes = Mes.getInstans();
        mes.addObserver(new Velcome());
        mes.addObserver(new Mtc());
        mes.addObserver(new Life());
        mes.addObserver(new Beltelecom());
        mes.notifyObserver("купание в нетрезвом виде опасно для жизни!!");
        System.out.println("****************Police***************");
        Police police = Police.getInstance();
        police.addObserver(new Velcome());
        police.addObserver(new Mtc());
        police.addObserver(new Life());
        police.addObserver(new Beltelecom());
        police.notifyObserver("Осторожно мошенники в городе");
    }
}
