package com.example.rmsys.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book 
{
    private long id;
    private String name;
    private String genre;
    private String writer;
    private int publishYear;
    private double price;

    public Book()
    {

    }

    public Book(Long id, String name, String genre, int publishYear, double price)
    {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.publishYear = publishYear;
        this.price = price;
    }
    
    @Id
    @GeneratedValue

    


    /**
     * @return long return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return String return the writer
     */
    public String getWriter() {
        return writer;
    }

    /**
     * @param writer the writer to set
     */
    public void setWriter(String writer) {
        this.writer = writer;
    }

    /**
     * @return int return the publishYear
     */
    public int getPublishYear() {
        return publishYear;
    }

    /**
     * @param publishYear the publishYear to set
     */
    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    /**
     * @return double return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

}