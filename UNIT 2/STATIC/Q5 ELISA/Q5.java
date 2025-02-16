import java.util.Scanner;
import java.util.Arrays;
public class Main {
// You are using Java
public static void main(String[] args) {
       //type your code here
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    char[] charArray = input.toCharArray();
    System.out.println("[");
    for(int i=0;i<charArray.length;i++){
        System.out.print(charArray[i]);
        if(i<charArray.length-1){
            System.out.print(", ");
        }
    }
    System.out.println("]");
}
