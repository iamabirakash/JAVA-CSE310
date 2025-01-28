import java.util.Scanner;

class Main {
// You are using Java
    public static void main(String[] args) {
        //Type your code here
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if(i>0 && i<2){
            System.out.println("Parking Fee: Rs.5.0");
        }
        else if(i>2 && i<4){
            System.out.println("Parking Fee: Rs.8.0");
        }
        else if(i>4){
            System.out.println("Parking Fee: Rs.10.0");
        }
        else{
            System.out.println("Hours parked cannot be negative.");
        }
        
    }
}
