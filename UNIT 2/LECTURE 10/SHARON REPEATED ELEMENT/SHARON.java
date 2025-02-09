import java.util.Scanner;

class Main {
  // You are using Java
    public static void main(String[] args) {
        //Type your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int count=-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(array[i]==array[j]){
                    count=array[i];
                    break;
                }
            }
            if(count!=-1){
                break;
            }
        }
            if(count!=-1){
                System.out.println(count);
            }
            else{
                System.out.println("No repeated element found in the array");
            }
        } 
    }
