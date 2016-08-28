package objects;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

public class Picture {
	private File pic;
	private String description;
	private Category category;
	private int points;
	private Date uploadDate;
	private ArrayList<Comment> comments;
	
	Picture(File pic, String description, Category category){
		this.pic = pic;
		this.description = description;
		this.category = category;
		this.points = 0;
		this.comments = new ArrayList<Comment>();
	}
	
	public void addComment(Comment comment){
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

	public void setCategory(Category category) {
		this.category = category;
	}
	
}
