package com.example.demo.pojo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BookShelf {
    private String ISBN;
    private String Book_Name;
    private String author;
    private String synopsis;
    private String status;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBook_Name() {
        return Book_Name;
    }

    public void setBook_Name(String book_Name) {
        Book_Name = book_Name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
//        return new Gson().toJson(this);//
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
