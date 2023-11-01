package jsoft.estate.article;

import java.sql.ResultSet;
import java.util.ArrayList;

import org.javatuples.Triplet;

import jsoft.ConnectionPool;
import jsoft.estate.basic.BasicImpl;
import jsoft.objects.ArticleObject;

public class ArticleImpl extends BasicImpl implements Article {

	public ArticleImpl(ConnectionPool cp, String objectName) {
		super(cp, objectName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ResultSet getArticle(int id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM tblarticle WHERE article_id=?";
		return this.get(sql, id);
	}

	@Override
	public ArrayList<ResultSet> getArticles(Triplet<ArticleObject, Short, Byte> infors) {
		// TODO Auto-generated method stub
		return null;
	}

}
