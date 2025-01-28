import java.util.Scanner;

class Main {
// You are using Java
    public static void main(String[] args) {
        //Type your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String result = (a>0 && b>0 && a%2!=0 && b%2!=0)?"Both integers are positive and not multiples of 2":"The condition is not met for both integers";
        System.out.println(result);
    }
}
