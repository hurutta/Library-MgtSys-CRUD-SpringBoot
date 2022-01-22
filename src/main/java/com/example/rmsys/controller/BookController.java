package com.example.rmsys.controller;

import com.example.rmsys.Entity.Book;
import com.example.rmsys.service.bookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class BookController 
{
    @Autowired
    public bookService bookService;

    @GetMapping(value = "/all")
    public List<Book> findAll()
    {
        return bookService.findAll();
    }

    @PostMapping(value = "/save")
    public Book save(@RequestBody Book book)
    {
        return bookService.save(book);
    }

    @PutMapping(value = "/update/{id}")
    public Book update(@RequestBody Book book,@PathVariable Long id)
    {
        return bookService.update(book,id);
    }

    @DeleteMapping(value = "/remove/{id}")
    public void delete(@PathVariable Long id)
    {
        bookService.delete(id);
    }
    
    @GetMapping(value = "/price/{from}/{to}")
    public List<Book> priceRange(@PathVariable int from, @PathVariable int to)
    {
        return bookService.priceRange(from,to);
    }
}
