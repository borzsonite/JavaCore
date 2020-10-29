package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.ФункциональныеИнтерфейсы_7_1.Sandbox.Metanit;

public class LambdaApp {


        public static void main(String[] args) {

            Expression func = (n)-> n%2==0;
            int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            System.out.println(sum(nums, func)); // 20
            System.out.println(sum(nums, (n)-> n%2==0)); // 20 лямбду можно не записывать в переменную а передать в метод в чистом виде
        }

        private static int sum (int[] numbers, Expression func) // принимает, что-то реализующее интерфейс с методом в нем указанным
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

    interface Expression{
        boolean isEqual(int n);
    }



