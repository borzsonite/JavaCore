package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.ФункциональныеИнтерфейсы_7_1.Sandbox;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_de;

import java.util.function.Predicate;

/**Использование ФИ Predicate
var1 - создать класс имплиментирующий ФИ
var2  - записать в переменную типа ФИ анонимный класс иплиментируюищйи ФИ и его методы
var3 - с помощью лямбды
 */

public class PredicateExample {
    public static void main(String[] args) {
        System.out.println(predicate.test(10));
        System.out.println(predicate1.test(-1));
        PredicateHelper predicateHelper = new PredicateHelper();
        System.out.println(predicateHelper.test(2));
    }

    static Predicate<Integer> predicate = new Predicate<Integer>() {
        @Override
        public boolean test(Integer t) {
            return t < 0;
        }
    };

    static Predicate<Integer> predicate1 = t -> t < 0;
}

 class PredicateHelper implements Predicate<Integer> {

     @Override
     public boolean test(Integer integer) {
         return integer>0;
     }
 }
