package com.library.io;

import com.library.model.Book;
import com.library.validation.BookValidator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CsvHandler {

    public static List<Book> readBooksFromCsv(String filePath) {

        List<Book> books = new ArrayList<>();

        try {BufferedReader reader = new BufferedReader(new FileReader(filePath));

            reader.readLine();

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                Book book = new Book(
                        Integer.parseInt(data[0]),
                        data[1], data[2], data[3], data[4],
                        Integer.parseInt(data[5]), Double.parseDouble(data[6])
                );

                BookValidator validator = new BookValidator();

                if (validator.validate(book).isEmpty()) {

                    books.add(book);

                } else {

                    System.out.println("Invalid Book : " + book.getTitle());
                }
            }

            reader.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return books;
    }
}