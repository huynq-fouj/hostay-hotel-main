package jsoft.estate.feedback;

import jsoft.ShareControl;
import jsoft.objects.FeedbackObject;

public interface Feedback extends ShareControl {

	public boolean AddFeedback(FeedbackObject item);
	
}
