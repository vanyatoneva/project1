package objects;

import java.io.File;
import java.util.ArrayList;

public class User {
	public enum Gender {
		MALE, FEMALE
	}

	public enum Country {

	}

	private File avatar;
	private String description;
	private Gender gender;
	private Country country;
	private String username;
	private String password;
	private String email;
	//TODO make posts treesets
	private ArrayList<Post> posts;
	private ArrayList<Post> upvotedPosts;
	private ArrayList<Post> commentedPosts;

	public User(String username, String password, String email) {
		// TODO validation
		this.username = username;
		this.password = password;
		this.email = email;
		this.description = "My funny collection";
		this.posts = new ArrayList<Post>();
		this.upvotedPosts = new ArrayList<Post>();
		this.commentedPosts = new ArrayList<Post>();
	}

//	User(String username, String email, String password, Gender gender, Country country) {
//		this.username = username;
//		this.email = email;
//		this.password = password;
//		this.gender = gender;
//		this.country = country;
//		this.posts = new ArrayList<Post>();
//		this.upvoted = new ArrayList<Post>();
//		this.commented = new ArrayList<Post>();
//	}

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

	public ArrayList<Post> getCommentedPosts() {
		return commentedPosts;
	}

	public void addComment(Post post, Comment comment) {
		commentedPosts.add(post);
		post.getComment(comment);
	}

	public ArrayList<Post> getPosts() {
		return posts;
	}

	public void addPost(Post picture) {
		posts.add(picture);
	}

	public ArrayList<Post> getUpvoted() {
		return upvotedPosts;
	}

	public void addUpvote(Post picture) {
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

	// public void upvote(Post pic, short vote){ // 1 or -1
	// pic.setPoints(pic.getPoints() + vote);
	// if(vote == 1){
	// this.addUpvote(pic);
	// }
	// }

	public void upvotePost(Post post) {
		post.getUpvote();
	}

	public void downvotePost(Post post) {
		post.getDownvote();
	}

	public void upvoteComment(Comment comment) {
		comment.getUpvote();
	}

	public void downvoteComment(Comment comment) {
		comment.getDownvote();
	}

	public void upvoteReply(Reply reply) {
		reply.getUpvote();
	}

	public void downvoteReply(Reply reply) {
		reply.getDownvote();
	}

	
	public void uploadPost(){
		//TODO create new post, upvote the post, add in upvoted
	}
	
	public void deletePost(){
		//TODO delete a post
	}
	
	public void commentPost(Post post, String text){
		//TODO comment a post, add in commented
	}
	
	public void replyComment(Comment comment, String text){
		//TODO reply to a comment
	}
	
	public void deleteComment(){
		//TODO delete comment
	}
	
	public void deleteReply(){
		//TODO delete reply
	}
	
	
}
