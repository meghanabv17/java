package org.xworkz.jdbc;

import org.xworkz.jdbc.dao.NewsPaper;
import org.xworkz.jdbc.dao.NewsPaperImpl;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        NewsPaper newsPaper = new NewsPaperImpl();

        //newsPaper.addpapers();

        newsPaper.getAllNewsPaper();

    System.out.println("Enter the date which you want a newspaper name");
    String date = scanner.next();
    newsPaper.getNewsPaperByDate(date);

    System.out.println("Enter the language which you want a newspaper name");
    String language = scanner.next();
    newsPaper.getNewsPaperByLang(language);

    System.out.println("Enter the id which you want the newspaper name");
    int id = scanner.nextInt();
    newsPaper.getNewsPaperById(id);

//getPaperNofPagesByLanguage
        System.out.println("Enter the language to get a total number of pages");
        language = scanner.next();
        newsPaper.getPaperNofPagesByLanguage(language);

        //getNoOfArticlesById
        System.out.println("Enter the id which you want the number if article");
        id = scanner.nextInt();
        newsPaper.getNoOfArticlesById(id);

        //getDateById;
        System.out.println("Enter the id which you want the date");
        id = scanner.nextInt();
        newsPaper.getDateById(id);

        System.out.println("Enter the date which you want to update the article");
        date = scanner.next();
        System.out.println("Enter the new article");
        int noofarticle = scanner.nextInt();
        newsPaper.UpdateNoOfArticlesByDate(date,noofarticle);

        /*System.out.println("Enter the id to delete a query");
        int id = scanner.nextInt();
        newsPaper.deleteNewsPaperById(id);*/


}
}
