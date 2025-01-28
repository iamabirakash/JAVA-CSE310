import java.util.Scanner;

public class Main {
// You are using Java
    public static void main(String[] args) {
        //Type your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean check = (a%4==0 || b%4==0);
        System.out.println(check);
    }
}
