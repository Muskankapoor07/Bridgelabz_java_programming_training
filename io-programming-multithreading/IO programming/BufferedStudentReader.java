import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStudentReader {

    public static void main(String[] args) {

        try {
            FileReader fileReader =
                    new FileReader("students.txt");

            BufferedReader reader =
                    new BufferedReader(fileReader);

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println(
                    "Error: " + e.getMessage()
            );
        }
    }
}