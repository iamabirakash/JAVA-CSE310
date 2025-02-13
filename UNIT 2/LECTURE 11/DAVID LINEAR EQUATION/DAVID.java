// You are using Java
class Equation {
    //Type your code here
    Equation(){
    }
    double a;
    double b;
    double c;
    double x;
    double y;
    Scanner sc = new Scanner(System.in);
    public void inputCoefficients(){
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
    }
    public void solveEquation(){
        if(a==0){
            System.out.println("a is zero");
        } else {
            x = (c-b)/a;
            System.out.printf("x = %.1f\n",x);
        }
        if(b==0){
            System.out.println("b is zero");
        } else {
            y = (c-a)/b;
            System.out.printf("y = %.1f",y);
        }
    }
}
