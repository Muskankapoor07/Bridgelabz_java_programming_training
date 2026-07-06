import java.io.FileWriter;
import java.io.IOException;

public class StudentFileWriter {

    public static void main(String[] args) {

        try {
            FileWriter writer =
                    new FileWriter("students.txt");

            writer.write("101, Muskan, 85\n");
            writer.write("102, Rahul, 78\n");
            writer.write("103, Priya, 92\n");

            writer.close();

            System.out.println(
                    "Student data written successfully"
            );

        } catch (IOException e) {
            System.out.println(
                    "Error: " + e.getMessage()
            );
        }
    }
}