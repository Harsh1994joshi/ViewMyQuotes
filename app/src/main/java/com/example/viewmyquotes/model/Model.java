package com.example.viewmyquotes.model;

public class Model {

    String id, quotes, author;

    public Model() {
    }

    public Model(String id, String quotes, String author) {
        this.id = id;
        this.quotes = quotes;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuotes() {
        return quotes;
    }

    public void setQuotes(String quotes) {
        this.quotes = quotes;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
