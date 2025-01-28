import java.util.Scanner;

class Main {
// You are using Java
    public static void main(String[] args) {
        //Type your code here
        Scanner sc=new Scanner(System.in);
        double i=sc.nextDouble();
        double c=(i-32)*5/9;
        if(i>=-100 && i<=150){
            System.out.printf("Temperature in Celsius: %.2f C%n",c);
        }
        else{
            System.out.println("Temperature outside the human-survivable range");
        }
    }
}
