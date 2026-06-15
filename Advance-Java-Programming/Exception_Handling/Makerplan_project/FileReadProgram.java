import java.io.*;

class FileMissingException
        extends RuntimeException {

    public FileMissingException(
            String message) {

        super(message);
    }
}

public class FileReadProgram {

    public static void main(String[] args) {

        try {

            BufferedReader reader =
                    new BufferedReader(
                            new FileReader(
                                    "sample.txt"));

            String line;

            while((line = reader.readLine())
                    != null) {

                System.out.println(line);
            }

            reader.close();

        } catch(FileNotFoundException e) {

            throw new FileMissingException(
                    "File Not Found!");

        } catch(IOException e) {

            System.out.println(
                    "Error Reading File");
        }
    }
}