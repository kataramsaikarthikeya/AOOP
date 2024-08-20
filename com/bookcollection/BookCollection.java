package com.bookcollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

	
	public class BookCollection implements Iterable<Book> {
	    private List<Book> books;

	    public BookCollection() {
	        books = new ArrayList<>();
	    }

	    public void addBook(Book book) {
	        books.add(book);
	    }

	    @Override
	    public Iterator<Book> iterator() {
	        return books.iterator();
	    }
	}



