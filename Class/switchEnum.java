enum Day {
Sun,Mon,Tue,Wed,Thu,Fri,Sat
}
public class switchEnum {
    public static void main(String[] args) {
        Day today = Day.Sat;
        switch(today){
            case Sun:
                System.out.println("Sun");
                break;
            case Mon:
                System.out.println("Mon");
                break;
            case Tue:
                System.out.println("Tue");
                break;
            case Wed:
                System.out.println("Wed");
                break;
            case Thu:
                System.out.println("Thu");
                break;
            case Fri:
                System.out.println("Fri");
                break;
            case Sat:
                System.out.println("Sat");
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
