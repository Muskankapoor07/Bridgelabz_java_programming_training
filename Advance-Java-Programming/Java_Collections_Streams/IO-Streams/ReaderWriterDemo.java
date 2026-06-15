import java.io.*;

public class ReaderWriterDemo {

    public static void main(String[] args)
            throws Exception {

        FileWriter writer =
                new FileWriter("data.txt");

        writer.write("Advance Java");

        writer.close();

        FileReader reader =
                new FileReader("data.txt");

        int ch;

        while((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }

        reader.close();
    }
}