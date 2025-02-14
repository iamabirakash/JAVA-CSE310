// You are using Java
class MyClass {
    int x;
    //type your code here
    MyClass(int x){
        this.x = x;
    }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();

        MyClass myObj = new MyClass(userInput);
        System.out.print("Value of x = " + myObj.x);

        scanner.close();
    }
}
