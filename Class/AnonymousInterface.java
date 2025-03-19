interface clickable {
    public void onClick();
}
public class AnonymousInterface {
    public static void main(String[] args) {
        clickable p = new clickable() {
            public void onClick(){
                System.out.println("Hello");
            }
        };
        p.onClick();
    }
}
