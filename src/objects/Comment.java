package objects;

import java.util.Date;
import java.util.TreeSet;

public class Comment extends PostResponse {
	
	//post?
	private TreeSet<Reply> replies;
	
	public Comment(String text, User writer, Date uploadDate) {
		super(text, writer, uploadDate);
		this.replies = new TreeSet<>();
	}
	
	public void getReply(Reply reply){
		replies.add(reply);
	}
	
	
	
}
