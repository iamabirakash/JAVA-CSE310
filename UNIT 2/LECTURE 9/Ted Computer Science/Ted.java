// You are using Java
import java.util.Scanner;
class Abc{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int i=sc.nextInt();
    int o=i;
    int sum=0;
    int count=0;
    
    do{
        sum+=i%10;
        count++;
       i/=10;
    } while(i>0);
    if(sum==count){
        System.out.println("The number of digits in "+o+" matches the sum of its digits.");
    }
    else{
        System.out.println("The number of digits in "+o+" does not match the sum of its digits.");
    }
    }
}
