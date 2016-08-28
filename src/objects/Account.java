package objects;

import java.io.File;
import java.util.ArrayList;

public class Account {
	public enum Gender{
		MALE, FEMALE
	}
	public enum Country{
		
	}
	private File avatar;
	private String description;
	private Gender gender;
	private Country country;
	private String username;
	private String password;
	private String email;
	private ArrayList<Picture> posts;
	private ArrayList<Picture> upvotes;
	private ArrayList<Picture> comments;
	
	Account(String username, String email, String password, Gender gender, Country country){
		this.username = username;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.country = country;
		this.posts  = new ArrayList<Picture>();
		this.upvotes = new ArrayList<Picture>();
		this.comments = new ArrayList<Picture>();
	}
	
	public File getAvatar() {
		return avatar;
	}
	public void setAvatar(File avatar) {
		this.avatar = avatar;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public ArrayList<Picture> getComments() {
		return comments;
	}
	public void addComment(Picture picCommented, Comment com){
		comments.add(picCommented);
		picCommented.addComment(com);
	} 
	public ArrayList<Picture> getPosts() {
		return posts;
	}
	public void addPost(Picture picture){
		posts.add(picture);
	}
	public ArrayList<Picture> getUpvotes() {
		return upvotes;
	}
	public void addUpvote(Picture picture){
		posts.add(picture);
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void upvote(Picture pic, short vote){ // 1 or -1
		pic.setPoints(pic.getPoints() + vote);
		if(vote == 1){
			this.addUpvote(pic);
		}
	}
	
}
