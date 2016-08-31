package objects;

import java.util.Date;

public class Reply extends PostResponse {

	//comment?
	
	public Reply(String text, User writer, Date uploadDate) {
		super(text, writer, uploadDate);
	}
	
	
}
