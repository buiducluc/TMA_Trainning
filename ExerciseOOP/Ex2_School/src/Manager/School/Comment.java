package Manager.School;

public class Comment {
	String title;
	
	String content;
	
	public Comment(){
		
	}
	
	public Comment(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Comment [title=" + title + ", content=" + content + "]";
	}
	
	
}
