package org.example;

import java.util.Date;

public class Motivation {
    private int id;
    private Date regDate;
    private String content;
    private String author;
    public Motivation(int id, String content, String author) {
        this.id = id;
        this.content = content;
        this.author = author;
        this.regDate = new Date();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getRegDate() {
        return regDate;
    }
    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }


}
