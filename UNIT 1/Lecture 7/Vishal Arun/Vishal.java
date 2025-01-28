import java.util.Scanner;

class Main {
// You are using Java
    public static void main(String[] args) {
        //Type your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(((a+b)%(a*b)==0)?"Sum is Multiple of Product":"Sum is Not Multiple of Product");
    }
}
