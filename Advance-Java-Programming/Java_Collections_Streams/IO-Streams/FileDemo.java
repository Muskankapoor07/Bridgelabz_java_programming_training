import java.io.File;

public class FileDemo {

    public static void main(String[] args) {

        File file =
                new File("sample.txt");

        System.out.println(
                "File Name: "
                        + file.getName());
    }
}