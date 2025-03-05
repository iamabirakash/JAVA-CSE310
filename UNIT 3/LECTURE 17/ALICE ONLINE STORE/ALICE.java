import java.util.Scanner;
// You are using Java
class Product {
    //type your code here
    double initialPrice;
    public Product(double initialPrice){
        this.initialPrice=initialPrice;
    }
   
}

class DiscountedProduct extends Product {
    //type your code here
    double discountRate;
    public DiscountedProduct(double initialPrice, double discountRate){
        super(initialPrice);
        this.discountRate=discountRate;
    }
    public double calculateSellingPrice(){
        if(discountRate<0 || discountRate>100){
            return -1;
        }
        return initialPrice*(1-discountRate);
    }
}
class ProductPricing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double initialPrice = scanner.nextDouble();
        double discountRate = scanner.nextDouble();
        DiscountedProduct discountedProduct = new DiscountedProduct(initialPrice, discountRate);
        double sellingPrice = discountedProduct.calculateSellingPrice();

        if (sellingPrice >= 0) {
            System.out.printf("Rs. %.2f%n", sellingPrice);
        } else {
            System.out.println("Not applicable");
        }
        scanner.close();
    }
}
