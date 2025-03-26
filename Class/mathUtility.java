class MathsUtils {
    public static int add(int a,int b){
        return a+b;
    }
    public static int multiply(int a,int b){
        return a*b;
    }
    public static boolean isEven(int num){
        return num%2==0;
    }
}
public class mathUtility {
    public static void main(String[] args) {
        System.out.println(MathsUtils.add(5,10));
        System.out.println(MathsUtils.multiply(5,10));
        System.out.println(MathsUtils.isEven(5));
    }
}
