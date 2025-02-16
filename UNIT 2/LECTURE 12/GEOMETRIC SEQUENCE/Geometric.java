// You are using Java
class GeometricSequence {
     //type your code here
    int a;
    int r;
    int N;
    String operation;
    double result;
    GeometricSequence(int a,int r,int N){
        this.a = a;
        this.r = r;
        this.N = N;
        this.operation = "term";
        // this.result = a*Math.pow(r,N-1);
        
    }
    GeometricSequence(int a,int r,int N,String operation){
        this.a = a;
        this.r = r;
        this.N = N;
        this.operation = operation;
        
    }
    double calculate(){
        if(operation.equals("term")){
            // this.result =  a*Math.pow(r,N-1);
            return a*Math.pow(r,N-1);
        } else if(operation.equals("sum")){
            if(r==1){
                // this.result =  a*N;
                return a*N;
            } else {
                // this.result = a*(1-Math.pow(r,N))/(1-r);
                return a*(1-Math.pow(r,N))/(1-r);
            }
        } else {
            System.out.println("Invalid operation specified.");
            return Double.NaN;
        }
        // return result;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int r = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.nextLine(); 

        String operation = scanner.nextLine();

        GeometricSequence sequence = new GeometricSequence(a, r, N, operation);

        double result = sequence.calculate();

        if (result != -1) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
