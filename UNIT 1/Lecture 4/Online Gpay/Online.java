// You are using Java
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float ft = sc.nextFloat();
        String pay = String.format("%.2f",ft);
        System.out.println("Please Gpay Rs."+pay);
        System.out.println("Thanks, Visit us again!");
    }
}
