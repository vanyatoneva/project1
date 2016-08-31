package objects;

import java.util.Date;

public abstract class PostResponse implements Votable {
	
	private String text;
	private User writer;
	private int points;
//	private Post pic;
	private Date uploadDate;
	
	
	public PostResponse(String text, User writer, Date uploadDate) {
	this.text = text;
	this.writer = writer;
	this.uploadDate = uploadDate;
}

	@Override
	public void getUpvote() {
		this.points += 1;

	}

	@Override
	public void getDownvote() {
		this.points -= 1;
		
	}

}
