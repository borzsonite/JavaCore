package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.ФункциональныеИнтерфейсы_7_1.Sandbox;

public class MethodReferenceExample2 {

    public static void main(String[] args) {
        int[] nums = { -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        System.out.println(sum(nums, ExpressionHelper::isEven));

        Expression expr = ExpressionHelper::isPositive;
        System.out.println(sum(nums, expr));
    }

    private static int sum (int[] numbers, Expression func)
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

class ExpressionHelper{

    static boolean isEven(int n){

        return n%2 == 0;
    }

    static boolean isPositive(int n){

        return n > 0;
    }
}

interface Expression{
    boolean isEqual(int n);
}
