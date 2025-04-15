import java.io.FileOutputStream;
public class bytesFOS {
    public static void main(String[] args){
        try {
            String text = "Hello";
            byte[] byteData = text.getBytes();
            System.out.println("Byte format of text: ");
            for(byte b : byteData){
                System.out.println(b+ " ");
            }
            FileOutputStream fos = new FileOutputStream("Output.txt");
            fos.write(byteData);
            fos.close();
        } catch (Exception e){
            e.getStackTrace();
        }
    }
}