import java.io.FileInputStream;

public class imageCount {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("Signature.jpg");
            int byteData;
            int count = 0;
            while((byteData = input.read())!=-1){
                count++;
            }
            input.close();
            System.err.println("Total Byte: "+count);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
