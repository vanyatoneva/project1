package objects;

import java.io.File;
import java.util.ArrayList;

public class Picture {
	private File pic;
	private String description;
	private Category category;
	private int points;
	private ArrayList<Comment> comments;
	
	Picture(File pic, String description, Category category){
		this.pic = pic;
		this.description = description;
		this.category = category;
		this.points = 0;
		this.comments = new ArrayList<Comment>();
		category.addPic(this);
	}
	
	public void addComment(Account account, Comment comment){
		account.addComment(this);
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
	
}
