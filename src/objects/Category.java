package objects;

import java.util.ArrayList;

public class Category {
	private String name;
	private ArrayList<Picture> pics;
	
	Category(String name){
		this.name = name;
		this.pics = new ArrayList<Picture>();
	}
	
	public void addPic(Picture pic){
		pics.add(pic);
	}
	
	public ArrayList<Picture> getFresh(){
		ArrayList<Picture> fresh = new ArrayList<Picture>();
		for(int i = pics.size(); i >= 0; i--){
			fresh.add(pics.get(i));
		}
		return fresh;
	}
	
	public ArrayList<Picture> getHot(){
		ArrayList<Picture> hot = new ArrayList<Picture>();
		return hot;
	}
}
