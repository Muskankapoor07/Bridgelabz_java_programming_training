import java.io.*;

public class ByteStreamDemo {

    public static void main(String[] args)
            throws Exception {

        FileOutputStream out =
                new FileOutputStream(
                        "sample.txt");

        out.write(65);

        out.close();

        System.out.println(
                "Data Written");
    }
}