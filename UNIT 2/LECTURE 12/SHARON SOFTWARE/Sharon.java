// You are using Java
class VelocityCalculator {
      //type your code here
    VelocityCalculator(){
    }
        static int calculateVelocity(int a,int b){
            return a/b;
        }
        static double calculateVelocity(double a,double b){
            return a/b;
        }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distanceInt = scanner.nextInt();
        int timeInt = scanner.nextInt();
        
        double distanceDouble = scanner.nextDouble();
        double timeDouble = scanner.nextDouble();
        int velocityInt = VelocityCalculator.calculateVelocity(distanceInt, timeInt);
        double velocityDouble = VelocityCalculator.calculateVelocity(distanceDouble, timeDouble);
        
        System.out.println("Velocity with integer inputs: " + velocityInt + " m/s");
        System.out.printf("Velocity with double inputs: %.2f m/s", velocityDouble);
        scanner.close();
    }
}
