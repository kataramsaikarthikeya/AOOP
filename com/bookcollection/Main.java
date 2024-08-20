package com.bookcollection;

public class Main {
	public static void main(String[] args) {
        
        BookCollection bookCollection = new BookCollection();

        
        bookCollection.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        bookCollection.addBook(new Book("1984", "George Orwell"));
        bookCollection.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));

        for (Book book : bookCollection) {
            System.out.println(book);
        }
    }

}
