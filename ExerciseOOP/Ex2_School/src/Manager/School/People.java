package Manager.School;

import java.util.List;

public class People {
	String name;
	List<Comment> listComment;
	
	public People(){
		
	}
	
	public People(String name, List<Comment> listComment) {
		super();
		this.name = name;
		this.listComment = listComment;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Comment> getListComment() {
		return listComment;
	}
	public void setListComment(List<Comment> listComment) {
		this.listComment = listComment;
	}
	
	public void addComment(Comment c){
		listComment.add(c);
	}
	

}
