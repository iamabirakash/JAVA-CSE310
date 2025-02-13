// You are using Java
class SecondsToTime {
   //type your code here
   int time;
   SecondsToTime(int t){
       time = t;
   }
    void displayTime(){
       int hour = time/3600;
       int min = (time%3600)/60;
       int sec = time%60;
       System.out.printf("%02d:%02d:%02d",hour,min,sec);
   }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSeconds = scanner.nextInt();
        scanner.close();

        SecondsToTime timeConverter = new SecondsToTime(totalSeconds);
        timeConverter.displayTime();
    }
}
