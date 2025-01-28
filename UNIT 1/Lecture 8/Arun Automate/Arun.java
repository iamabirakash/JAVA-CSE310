import java.util.Scanner;

class Main {
// You are using Java
    public static void main(String[] args) {
        //Type your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int average=(a+b+c+d+e)/5;
        System.out.println("Average Score: "+average);
            
        if(average>=50){
            // System.out.println("Average Score: "+average);
            System.out.println("The student has passed");
        }
        else
        {
            // System.out.println("Average Score: "+average);
            System.out.println("The student has failed");
        
        }
    }}
