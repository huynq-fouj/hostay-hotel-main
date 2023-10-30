package jsoft.estate.feedback;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import jsoft.ConnectionPool;
import jsoft.estate.basic.BasicImpl;
import jsoft.objects.FeedbackObject;

public class FeedbackImpl extends BasicImpl implements Feedback {

	
	public FeedbackImpl(ConnectionPool cp) {
		super(cp, "Feedback");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean AddFeedback(FeedbackObject item) {
		// TODO Auto-generated method stub
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO tblfeedback(feedback_title, feedback_content, feedback_email, feedback_fullname, feedback_created_date, feedback_view) ");
		sql.append("VALUES(?,?,?,?,?,?);");
		try {
			PreparedStatement pre = this.con.prepareStatement(sql.toString());
			pre.setString(1, item.getFeedback_title());
			pre.setString(2, item.getFeedback_content());
			pre.setString(3, item.getFeedback_email());
			pre.setString(4, item.getFeedback_fullname());
			pre.setString(5, item.getFeedback_created_date());
			pre.setBoolean(6, false);			
			return this.add(pre);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				this.con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return false;
	}

}
