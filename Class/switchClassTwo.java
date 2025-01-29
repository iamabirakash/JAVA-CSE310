import java.util.Scanner;
public class switchClassTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // char a = sc.next().charAt(0);
        // switch(a){
        //     case 'a':
        //         System.out.println("The inputed character is a");
        //         break;
        //     case 'b':
        //         System.out.println("The inputed character is b");
        //         break;
        //     default:
        //         System.out.println("Different Input");
        //         break;
        // }
        // sc.close();
        String a = sc.nextLine();
        sc.close();
        switch(a){
            case "abir":
                System.out.println("The input value is abir");
                break;
            case "java":
                System.out.println("The input value is java");
                break;
            case "Hello Challo":
                System.out.println("The input value is space");
                break;
            default:
                System.out.println("Different String");
                break;
            }
        }
}
