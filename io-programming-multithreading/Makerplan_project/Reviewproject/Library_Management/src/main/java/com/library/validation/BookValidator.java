package com.library.validation;

import com.library.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookValidator implements Validator<Book> {

    @Override
    public List<String> validate(Book book) {

        List<String> errors = new ArrayList<>();

        if (book.getBookId() <= 0) {
            errors.add("Invalid Book ID");
        }

        if (book.getTitle() == null || book.getTitle().isEmpty()) {
            errors.add("Title is Empty");
        }

        if (book.getQuantity() < 0) {
            errors.add("Quantity cannot be negative");
        }

        if (book.getPrice() <= 0) {
            errors.add("Price must be positive");
        }

        return errors;
    }
}