package org.xworkz.jdbc.service;

import org.xworkz.jdbc.dao.NewsPaper;

public interface service {

    NewsPaper[]  getAllNewsPaper();
    NewsPaper addpapers();
    NewsPaper getNewsPaperByDate(String date);
    NewsPaper getNewsPaperByLang(String language);
    NewsPaper getNewsPaperById(int id);
    NewsPaper getPaperNofPagesByLanguage(String language);
    NewsPaper getNoOfArticlesById(int id);
    NewsPaper getDateById(int id);
    NewsPaper UpdateNoOfArticlesByDate(String date,int noOfArticle);
    NewsPaper deleteNewsPaperById(int id);

}
