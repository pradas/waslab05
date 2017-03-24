package twitter;

import twitter4j.FilterQuery;
import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;

public class SimpleClient {

	public static void main(String[] args) throws Exception {
		
		TwitterStream twitterStream = new TwitterStreamFactory().getInstance();
		
		StatusListener statusListener = new StatusListener() {
	        @Override
	        public void onStatus(Status status) {
	            // TODO Auto-generated method stub
	            System.out.println(status.getUser().getName() + " (@" + 
	            status.getUser().getScreenName() + ") "  +status.getText());
	            System.out.println();
	        }

			@Override
			public void onDeletionNotice(StatusDeletionNotice arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onScrubGeo(long arg0, long arg1) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onStallWarning(StallWarning arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onTrackLimitationNotice(int arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onException(Exception arg0) {
				// TODO Auto-generated method stub
				
			}
		};
				
		twitterStream.addListener(statusListener);
				
		// Filter
	    FilterQuery filtre = new FilterQuery();
	    String[] keywordsArray = {"#barcelona"};
	    filtre.track(keywordsArray);
	    
	    twitterStream.filter(filtre);
		
	}
}
