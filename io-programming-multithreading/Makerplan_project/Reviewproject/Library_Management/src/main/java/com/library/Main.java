package com.library;

import com.library.io.CsvHandler;
import com.library.model.Book;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Book> books = CsvHandler.readBooksFromCsv(
                "src/main/resources/books.csv"
        );
        System.out.println("Books Loaded Successfully");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}