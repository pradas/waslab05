package twitter;

import java.util.Date;

import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;

public class SimpleClient {

	public static void main(String[] args) throws Exception {
		
		final Twitter twitter = new TwitterFactory().getInstance();
		
		//Date now = new Date();
		ResponseList<Status> tweets = twitter.getUserTimeline("fib_was");
		System.out.println(tweets.get(0).getText());
		twitter.retweetStatus(tweets.get(0).getId());
		
		/*String latestStatus = "I want to increase the Klout score of @cfarre [task #4 completed "+now+"]";
		Status status = twitter.updateStatus(latestStatus);
		System.out.println("Successfully updated the status to: " + status.getText());*/       
	}
}
