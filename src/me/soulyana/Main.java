package me.soulyana;

        import java.util.ArrayList;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Newspaper> newspaperArrayList = new ArrayList<Newspaper>();
        ArrayList<Article> articleArrayList = new ArrayList<Article>();


        Newspaper newspaper = new Newspaper();
        String ans = "";

        do {
            System.out.println("What is the title of the newspaper?");
            newspaper.setTitle(scan.nextLine());

            do {
                Article article = new Article();

                System.out.println("What is the title of the article");
                article.setTitle(scan.nextLine());

                System.out.println("What is the date of the article?");
                article.setDate(scan.nextLine());

                newspaper.addArticle(article);

                System.out.println("Would you like to add another article? (Y)es or (N)o");
                ans = scan.nextLine();
            } while (ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n"));

            System.out.println("Would you like to add another newspaper? (Y)es or (N)o");
            ans = scan.nextLine();
        }while (ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n"));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" );
        System.out.println("~~~~~~~~~ " + newspaper.getTitle() + " ~~~~~~~~~~");
        for (Article articles : newspaper.getArticles()) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Article title: " + articles.getTitle());
            System.out.println("Article date: " + articles.getDate());
            System.out.println();
        }
    }
}

