// You are using Java
import java.util.Scanner;
class EnumExample{
    enum GameLevel{
        EASY,MEDIUM,HARD
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        GameLevel level;
        if(n>=0 && n<=50){
            level=GameLevel.EASY;
        }
        else if(n>50 && n<=75){
            level=GameLevel.MEDIUM;
        }
        else{
            level=GameLevel.HARD;
        }
        System.out.println(level);
    }
}
