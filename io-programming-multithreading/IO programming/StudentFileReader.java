import java.io.FileReader;
import java.io.IOException;

public class StudentFileReader {

    public static void main(String[] args) {

        try {
            FileReader reader =
                    new FileReader("students.txt");

            int data;

            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println(
                    "Error: " + e.getMessage()
            );
        }
    }
}