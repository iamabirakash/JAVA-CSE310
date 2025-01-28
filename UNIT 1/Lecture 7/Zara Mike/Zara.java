import java.util.Scanner;

public class Main {
// You are using Java
    public static void main(String[] args) {
        //Type your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (a>b?a-b:a+b)*2;
        System.out.println("Result of ("+a+ " > "+b+" ? "+a+" - "+b+" : "+a+" +"+b+") * 2: "+c);
    }
}
