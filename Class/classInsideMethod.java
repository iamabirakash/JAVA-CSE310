class Person{
    void myMethod(){
        class Inner{
            void display(){
                System.out.println("Inner Display");
            }
        }
        Inner in = new Inner();
        in.display();
    }
}
public class classInsideMethod {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.myMethod();
    }
}
