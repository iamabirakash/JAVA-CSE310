class Person{
    public void display(){
        System.out.println("Hi");
    }
}
public class AnnonymClass{
    public static void main(String[] args) {
        Person obj = new Person(){
            public void display(){
                System.out.println("Hello");
            }
        };
        obj.display();
    }
}
