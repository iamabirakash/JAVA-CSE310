import java.util.Scanner;

class DecimalRounding {
// You are using Java
    public static void main(String[] args) {
        //Type your code here
        Scanner sc=new Scanner(System.in);
        double i=sc.nextDouble();
        int a=sc.nextInt();
        switch(a){
            case 1:
                double d=Math.round(i);
                System.out.println("Rounded to the nearest whole number: "+d);
                break;
        
            case 2:
                String s=String.format("%.1f",i);
                System.out.println("Rounded to one decimal place: "+s);
                break;
            case 3:
                String b=String.format("%.2f",i);
                System.out.println("Rounded to two decimal places: "+b);
                break;
            default:
            System.out.println("Invalid choice.");
            break;
    }
    }
}
