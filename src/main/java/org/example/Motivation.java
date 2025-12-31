package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Motivation {
    private int id;
    private String regDate;
    private String content;
    private String author;
    public Motivation(int id, String content, String author) {
        this.id = id;
        this.content = content;
        this.author = author;
        Date nowDate = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strNowDate = simpleDateFormat.format(nowDate);
        this.regDate = strNowDate;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getRegDate() {
        return regDate;
    }
    public void setRegDate(String regDate) {
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
