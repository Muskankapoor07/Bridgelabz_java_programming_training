package com.library.model;

public class Transaction {

    private String transactionId;
    private String patronName;
    private int bookId;
    private String status;
    private double fine;

    public Transaction() {
    }

    public Transaction(String transactionId,
                       String patronName,
                       int bookId,
                       String status) {

        this.transactionId = transactionId;
        this.patronName = patronName;
        this.bookId = bookId;
        this.status = status;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getPatronName() {
        return patronName;
    }

    public int getBookId() {
        return bookId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    @Override
    public String toString() {
        return transactionId + " " + patronName + " " + status;
    }
}