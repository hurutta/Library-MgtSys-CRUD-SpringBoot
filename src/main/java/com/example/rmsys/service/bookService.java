package com.example.rmsys.service;

import java.util.ArrayList;
import java.util.List;

import com.example.rmsys.Entity.Book;
import com.example.rmsys.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bookService 
{
    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAll()
    {
        return bookRepository.findAll();
    }

    public Book save(Book book)
    {
        return bookRepository.save(book);
    }

    public Book update(Book book,Long id)
    {
        book.setId(id);
        return bookRepository.save(book);
    }

    public void delete(Long id)
    {
        bookRepository.deleteById(id);
    }
    
    public List<Book> priceRange(int from, int to)
    {
        List<Book> booksBetweenRange = new ArrayList<Book>();
        List<Book> allBook = new ArrayList<Book>();
        allBook = bookRepository.findAll();
        for(int i=0; i < allBook.size(); i++)
        {
            Book currentBook = allBook.get(i);
            if(from <= currentBook.getPrice() && currentBook.getPrice() <= to)
            {
                booksBetweenRange.add(currentBook);
            }
        }
        return booksBetweenRange;
    }
}
