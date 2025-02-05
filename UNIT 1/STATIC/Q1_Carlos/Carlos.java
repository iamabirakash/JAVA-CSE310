import java.util.Scanner;
public class Main {
// You are using Java
public static void main(String[] args) {
        //type your code here
        Scanner sc = new Scanner(System.in);
        String DN = sc.nextLine();
        String Status = sc.nextLine();
        int MN = sc.nextInt();
        System.out.println("Device Name: "+DN);
        System.out.println("Status: "+Status);
        System.out.println("Model Number: "+MN);
    }
}
