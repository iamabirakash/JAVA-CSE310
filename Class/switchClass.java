import java.util.*;
public class switchClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a){
            case 1:
            System.out.println("The input number is 1");
            break;
            case 2:
            System.out.println("The input number is 2");
            break;
            default:
            System.out.println("Different");
            break;
        }
        sc.close();
    }
}
