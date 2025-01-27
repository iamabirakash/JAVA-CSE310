// You are using Java
import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int training = sc.nextInt();
        int size = sc.nextInt();
        float rate = sc.nextFloat();
        String frate = String.format("%.2f",rate);
        boolean status = sc.nextBoolean();
        System.out.println("Model Name: "+name);
        System.out.println("Training Epochs: "+training);
        System.out.println("Batch Size: "+size);
        System.out.println("Learning Rate: "+frate);
        System.out.println("Training Successful: "+status);
    }
}
