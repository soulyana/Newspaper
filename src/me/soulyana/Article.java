package me.soulyana;

import java.util.ArrayList;

public class Article {
    private String title;
    private String date;
    private ArrayList<String> articles = new ArrayList<String>();

    public Article() {

    }

    public Article(String titleIn, String dateIn) {
        this.title = titleIn;
        this.date = dateIn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<String> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<String> articles) {
        this.articles = articles;
    }
}
