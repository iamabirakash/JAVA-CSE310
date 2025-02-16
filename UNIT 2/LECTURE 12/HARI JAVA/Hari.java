// You are using Java
class Summation {
    //type your code here
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m  = scanner.nextInt();
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        Summation summation = new Summation();
        int sum2 = summation.sum(m, n); 
        int sum3 = summation.sum(a, b, c); 
        System.out.println("Sum of two integers: " + sum2);
        System.out.println("Sum of three integers: " + sum3);
        scanner.close();
    }
}
