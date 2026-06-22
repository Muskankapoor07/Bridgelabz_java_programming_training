package com.library.io;

import java.io.*;

public class FileOperations {

    public static void verifyDirectory(String folderPath) {

        File file = new File(folderPath);

        if (!file.exists()) {
            file.mkdirs();
            System.out.println("Folder Created");
        } else {
            System.out.println("Folder Already Exists");
        }
    }

    public static void writeReceipt(String filePath, String content)
            throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

        writer.write(content);

        writer.close();

        System.out.println("Receipt Saved");
    }
}