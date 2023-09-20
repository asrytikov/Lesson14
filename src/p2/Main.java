package p2;

public class Main {

    public static void main(String[] args) {
        int[] nums = {-5,-3,-1,1,2,3,4,5,6,7,8,9};
        System.out.println(sum(nums, ExpressionHelper::isEven));

        Expression expression = ExpressionHelper::isPositive;
        System.out.println(sum(nums, expression));


    }

    private static int sum(int[] numbers, Expression func){
        int result = 0;
        for(int i : numbers){
            if (func.isEqual(i)){
                result +=i;
            }
        }
        return result;
    }

}

class ExpressionHelper{
    static boolean isEven(int n){
        return n%2 ==0;
    }
    static boolean isPositive(int n){
        return n>0;
    }
}


interface Expression{
    boolean isEqual(int n);
}