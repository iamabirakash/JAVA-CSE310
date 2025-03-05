import java.util.Scanner;
// You are using Java
class Calculator {
    //type your code here
    public int add(int num1,int num2){
        return num1+num2;
    }
    public int subtract(int num1,int num2){
        return num1-num2;
    }
    public int multiply(int num1,int num2){
        return num1*num2;
    }
}

class AdvancedCalculator extends Calculator {
    //type your code here
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdvancedCalculator calculator = new AdvancedCalculator();

        int choice = scanner.nextInt();

        if (choice < 1 || choice > 3) {
            System.out.println("Invalid");
            return;
        }
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int result;

        if (choice == 1) {
            result = calculator.add(num1, num2);
            System.out.println("Addition: " + result);
        } else if (choice == 2) {
            result = calculator.subtract(num1, num2);
            System.out.println("Subtraction: " + result);
        } else {
            result = calculator.multiply(num1, num2);
            System.out.println("Multiplication: " + result);
        }
    }
}
