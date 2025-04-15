import java.io.FileInputStream;
import java.io.FileOutputStream;

public class imageBMP {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Signature.bmp");
            FileOutputStream fos = new FileOutputStream("Copy.bmp");
            byte[] header = new byte[54];
            int headerBytesRead = fis.read(header);
            while(headerBytesRead!=1){
                System.out.println("Error: The file does not appear to be a standard bmp");
                fis.close();
                fos.close();
                return;
            }
            fos.write(header);
            int byteData;
            while((byteData = fis.read())!=-1){
                int invertByte = 255 - byteData;
                fos.write(invertByte);
            }
            fis.close();
            fos.close();
            System.out.println("Imaged modified and saved as output.bmp");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
