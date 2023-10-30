package jsoft.estate.feedback;

import jsoft.ConnectionPool;
import jsoft.objects.FeedbackObject;

public class FeedbackControl {
	
	private FeedbackModel fm;
	
	public FeedbackControl(ConnectionPool cp) {
		this.fm = new FeedbackModel(cp);
	}
	
	public ConnectionPool getCP() {
		return this.fm.getCP();
	}
	
	public void releaseConnection() {
		this.fm.releaseConnection();
	}
	
	public boolean AddFeedback(FeedbackObject item) {
		return this.fm.AddFeedback(item);
	}
	
}
