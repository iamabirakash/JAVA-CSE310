import java.util.Scanner;

public class Main {
// You are using Java
public static void main(String[] args) {
        //type your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a*b;
        int d;
        System.out.println("Total Cost: "+c);
        
            if(c<=1000){
                System.out.println("Payment Method Suggestion: Payment by cash or check is recommended.");
            }
            else if(c>1000 && c<5000){
                System.out.println("Payment Method Suggestion: Payment by credit card is recommended.");
            }
            else{
                System.out.println("Payment Method Suggestion: Payment by bank transfer is recommended.");
        }
        switch(c){
            case 1:
                a=0;
                break;
            default:
             break;
        }
        
    }
}


