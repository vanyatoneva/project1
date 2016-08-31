package objects;

import java.util.ArrayList;

public class Category {
	private String name;
	//TODO make posts treeset
	private ArrayList<Post> posts;
	
	Category(String name){
		this.name = name;
		this.posts = new ArrayList<Post>();
	}
	
	public void addPost(Post post){
		posts.add(post);
	}
	
	public ArrayList<Post> getFresh(){
		ArrayList<Post> fresh = new ArrayList<Post>();
		for(int i = posts.size(); i >= 0; i--){
			fresh.add(posts.get(i));
		}
		return fresh;
	}
	
	public ArrayList<Post> getHot(){
		ArrayList<Post> hot = new ArrayList<Post>();
		return hot;
	}
}
