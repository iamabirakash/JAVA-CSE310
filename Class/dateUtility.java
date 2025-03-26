import java.time.LocalDate;
class DateUtils {
    public static LocalDate getCurrentDate(){
        return LocalDate.now();
    }
    public static void printDate(int year,int month,int day){
        System.out.println("Date: "+year+"-"+month+"-"+day);
    }
}
public class dateUtility {
    public static void main(String[] args) {
        System.out.println("Today's Date: "+DateUtils.getCurrentDate());
        DateUtils.printDate(2014,3,23);
    }
}
