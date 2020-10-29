package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.ФункциональныеИнтерфейсы_7_1.Sandbox.Metanit;


    // функциональный интерфейс
    interface Expression2{
        boolean isEqual(int n);
    }

    // класс, в котором определены методы
    class ExpressionHelper{  // класс реализует методы интерфейса
        static boolean isEven(int n){
            return n%2 == 0;
        }

        static boolean isPositive(int n){
            return n > 0;
        }
    }

    public class LambdaApp2 {

        public static void main(String[] args) {

            int[] nums = { -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
            System.out.println(sum(nums, ExpressionHelper::isEven));

            Expression2 expr = ExpressionHelper::isPositive;
            System.out.println(sum(nums, expr));
        }

        //В основном классе программы LambdaApp определен метод sum(), который возвращает сумму элементов массива, соответствующих некоторому условию. Условие передается в виде объекта функционального интерфейса Expression.
        private static int sum (int[] numbers, Expression2 func)
        {
            int result = 0;
            for(int i : numbers)
            {
                if (func.isEqual(i))
                    result += i;
            }
            return result;
        }
    }

