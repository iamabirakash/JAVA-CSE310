// You are using Java
import java.util.Scanner;
class java {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int end = sc.nextInt();
        for(int i=first;i<=end;i++){
            int cnt = 0;
            for(int j=1;j<=i/2;j++){
                if(i%j==0){
                    cnt++;
                }
            }
            if(cnt==1){
                System.out.print(i+" ");
            }
        }
    }
}
