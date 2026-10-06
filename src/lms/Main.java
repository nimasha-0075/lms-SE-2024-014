package lms;

import lms.model.Book;
import lms.model.DVD;


public class Main {
    public static void main(String[] args) {
        Book b = new Book("B001", "Clean Code", "Robert C. Martin");
        DVD d = new DVD("D001", "Intro to Algorithms", 120);
        System.out.println(b.calculateLateFee(3));
        System.out.println(d.calculateLateFee(3));
        new Book("207", "Harry Potter", "J.K.Rowling");
    }
}