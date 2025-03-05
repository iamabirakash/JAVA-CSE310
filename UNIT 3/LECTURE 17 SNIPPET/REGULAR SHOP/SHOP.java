import java.util.Scanner;
// You are using Java
class Shop {
    //type your code here
    double a;
    double calculateFinalPrice(double OP){
        double a = 0.9*OP;
        return a;
    }
}

class HolidayShop extends Shop {
    //type your code here
    double calculateFinalPrice(double OP){
        double b = (0.9*OP)*(0.95);
        return b;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double originalPrice = scanner.nextDouble();

        Shop regularShop = new Shop();
        HolidayShop holidayShop = new HolidayShop();

        double regularPrice = regularShop.calculateFinalPrice(originalPrice);
        double holidayPrice = holidayShop.calculateFinalPrice(originalPrice);

        System.out.println("Regular Shop Final Price: " + regularPrice);
        System.out.println("Holiday Shop Final Price: " + holidayPrice);

        scanner.close();
    }
}
