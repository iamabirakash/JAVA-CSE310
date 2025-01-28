import java.util.Scanner;
class CreditScoreCalculator {
// You are using Java
    public static void main(String[] args) {
        //Type your code here
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        double c=sc.nextDouble();
        switch (i){
            case 1:
                if(c==0){
                    System.out.println("Credit Score: 800");
                }
                else if(c==1){
                    System.out.println("Credit Score: 750");
                }
                 else if(c==2){
                    System.out.println("Credit Score: 700");
                }
                 else if(c==3){
                    System.out.println("Credit Score: 650");
                }
                 else if(c==4){
                    System.out.println("Credit Score: 600");
                }
                 else{
                    System.out.println("Credit Score: 550");
                }
                break;
            case 2:
                double debt=c;
                if(debt<=30){
                    System.out.println("Debt Score: Good");
                }
                else if(debt>30 && debt<50){
                    System.out.println("Debt Score: Average");
                }
                  else{
                    System.out.println("Debt Score: Poor");
                }
                break;
            case 3:
                if(c>=50000){
                    System.out.println("Income Score: Good");
                }
                else if(c>30000 && c<50000){
                    System.out.println("Income Score: Avearge");
                }
                  else{
                    System.out.println("Income Score: Poor");
                }
                break;
        }
    }
}
