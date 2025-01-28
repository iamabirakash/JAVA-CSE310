import java.util.Scanner;

class Main {
// You are using Java
    public static void main(String[] args) {
        //Type your code here
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int sum =0;
        
            
        
        if(i>=10 && i<=99){
            sum+= i%10;
            sum+= i/10;
            System.out.println("Digit Sum: "+sum);
            if(sum<10){
                // System.out.println("Digit Sum: "+sum);
                System.out.println("The sum of the digits is less than 10.");
            }
            else{
                // System.out.println("Digit Sum: "+sum);
                System.out.println("The sum of the digits is not less than 10.");
            }
        }
        else{
            System.out.println("Not a valid two-digit number.");
        }
    }
}
