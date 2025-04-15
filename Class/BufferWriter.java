import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferWriter {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Output.txt"))) {
            writer.write("Hello, I'm using try");
            writer.newLine();
            writer.write("NewLine");
        } catch (Exception e){
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader("Output.txt"))) {
            String line;
            while((line = reader.readLine()) !=null){
                System.out.println(line);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
