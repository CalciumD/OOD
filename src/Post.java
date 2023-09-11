
public class Post {

	private String text;
	
	
	
	public String quote() {
		if(text.length() > 0) {
			return text;
		}
		else {
			return "";
		}
	}
	
	public Post(String text) {
		this.text = text;	
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
