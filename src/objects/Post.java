package objects;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

public class Post implements Votable{
	private File picture;
	private String description;
	private Category category;
	private int points;
	private Date uploadDate;
	//TODO make comments treeset
	private ArrayList<Comment> comments;
	
	Post(File picture, String description, Category category){
		this.picture = picture;
		this.description = description;
		this.category = category;
		this.points = 0;
		this.comments = new ArrayList<Comment>();
		category.addPost(this);
	}
	
	public void getComment(Comment comment){
		comments.add(comment);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
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
