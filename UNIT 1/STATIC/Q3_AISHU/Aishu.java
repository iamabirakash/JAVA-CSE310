import java.util.Scanner;

class DeadpoolMarathon {
// You are using Java
public static void main(String[] args) {
       //type your code here
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = (a%b==0)?(a/b)-1:(a/b);
       int d = a*45+c*15;
       System.out.println(d+" minutes");
    }}
