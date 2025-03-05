import java.util.Scanner;
// You are using Java
class Parcel {
   //type your code here
   protected int basicCost;
   public Parcel(int basicCost){
       this.basicCost=basicCost;
   }
   public int calculateCost(){
       return basicCost;
   }
}

class FragileParcel extends Parcel {
   //type your code here
   int extraPackingCost;
   int insuranceCost;
   public FragileParcel(int basicCost,int extraPackingCost,int insuranceCost){
       super(basicCost);
       this.extraPackingCost=extraPackingCost;
       this.insuranceCost=insuranceCost;
   }
   
@Override
public int calculateCost(){
    return basicCost+extraPackingCost+insuranceCost;
}
}
public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int basicCost = scanner.nextInt();
       int extraPackingCost = scanner.nextInt();
       int insuranceCost = scanner.nextInt();
       Parcel regularParcel = new Parcel(basicCost);
       FragileParcel fragileParcel = new FragileParcel(basicCost, extraPackingCost, insuranceCost);
       System.out.println("Regular Parcel Cost: " + regularParcel.calculateCost() + " rupees");
       System.out.println("Fragile Parcel Cost: " + fragileParcel.calculateCost() + " rupees");
       scanner.close();
   }
}
