// You are using Java
class PalindromeChecker{
    int a;
    PalindromeChecker(int a){
        this.a = a;
    }
    void displayPalindromeCheckResult(){
        int temp = a;
        int rem=0;
        int rev = 0;
        while(temp>0){
            rem = temp%10;
            rev = rev*10+rem;
            temp /= 10;
        }
        if(a==rev){
            System.out.println(a + " is a Palindrome");
        } else {
            System.out.println(a + " is not a Palindrome");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();

        PalindromeChecker palindromeChecker = new PalindromeChecker(inputNumber);

        palindromeChecker.displayPalindromeCheckResult();

        scanner.close();
    }
}
