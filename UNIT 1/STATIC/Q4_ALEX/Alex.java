public class Main {
// You are using Java
public static void main(String[] args) {
       //type your code here 
       Scanner sc = new Scanner(System.in);
       int x1 = sc.nextInt();
       int y1 = sc.nextInt();
       int x2= sc.nextInt();
       int y2= sc.nextInt();
       double e = Math.sqrt(x1*x1+y1*y1);
       double f = Math.sqrt(x2*x2+y2*y2);
       double g=Math.min(e,f);
       String s=String.format("%.1f",g);
       if(x1==x2){
           System.out.println("Closer Distance: "+s);
           System.out.println("Orientation: Vertical");
       } else if(y1==y2){
            System.out.println("Closer Distance: "+s);
           System.out.println("Orientation: Horizontal");
       } else {
            System.out.println("Closer Distance: "+s);
           System.out.println("Orientation: Oblique");
       }
}}
