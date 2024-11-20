package org.xworkz.jdbc.dao;

import org.xworkz.jdbc.dto.NewspaperDto;
import org.xworkz.jdbc.exception.LanguageNotFoundException;

public interface NewsPaper {

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

    /*getEditorNameByPaperName throws EditorNotFoundException;
    EditorNotFoundException extends Exception*/
}
