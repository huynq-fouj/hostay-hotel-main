package jsoft.estate.article;

import java.sql.ResultSet;
import java.util.ArrayList;

import org.javatuples.Triplet;

import jsoft.ShareControl;
import jsoft.objects.ArticleObject;

public interface Article extends ShareControl {

	public ResultSet getArticle(int id);
	public ArrayList<ResultSet> getArticles(Triplet<ArticleObject, Short, Byte> infors);
	
}
