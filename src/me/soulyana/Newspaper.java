package me.soulyana;

import java.util.ArrayList;

public class Newspaper {
     private String title;
     private ArrayList<Article>  articles;

    public Newspaper() {
        articles = new ArrayList<Article>();
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Article> articles) {
        this.articles = articles;
    }

    public void addArticle(Article article) {
        articles.add(article);
    }
}
