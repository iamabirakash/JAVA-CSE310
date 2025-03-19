interface myFunction{
    void show();
}
class myClass implements myFunction {
    public void show(){
        System.out.println("Hello");
    }
}
public class lambdaFunction {
    public static void main(String[] args) {
        // myFunction obj = new myClass();
        // obj.show();

        myFunction obj = () -> System.out.println("Hii");
        obj.show();
    }
}
