import java.util.Scanner;
// You are using Java
class SuperClass{
    //type your code here
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
}
class SubClass extends SuperClass {
    //type your code here
    int b = (super.a)*2;
    public void displayVariables(){
        System.out.println("The value of SuperClass: "+a);
        System.out.println("The value of SubClass: "+b);
    }
}
class Main 
{
  public static void main(String[] args)
  {
    SubClass obj = new SubClass();
    obj.displayVariables();
  }
}
