import java.io.FileInputStream;
import java.io.FileOutputStream;
public class imagecopy {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("Signature.jpg");
            FileOutputStream output = new FileOutputStream("Copy.jpg");
            byte[] arr = new byte[1024];
            int bytesRead;
            while((bytesRead = input.read(arr))!=-1){
                output.write(arr,0,bytesRead);
            }
            input.close();
            output.close();
            System.err.println("Image Copied");
        } catch (Exception e){
            e.setStackTrace(null);
        }
    }
}
