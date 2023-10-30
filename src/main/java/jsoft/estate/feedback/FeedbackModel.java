package jsoft.estate.feedback;

import jsoft.ConnectionPool;
import jsoft.objects.FeedbackObject;

public class FeedbackModel {
	
	private FeedbackImpl fi;
	
	public FeedbackModel(ConnectionPool cp) {
		this.fi = new FeedbackImpl(cp);
	}
	
	public ConnectionPool getCP() {
		return this.fi.getCP();
	}
	
	public void releaseConnection() {
		this.fi.releaseConnection();
	}
	
	public boolean AddFeedback(FeedbackObject item) {
		return this.fi.AddFeedback(item);
	}
	
}
