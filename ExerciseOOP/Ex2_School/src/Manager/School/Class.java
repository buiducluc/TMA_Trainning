package Manager.School;

import java.util.List;

public class Class {
	private String idClass;
	List<Comment> listComment;	
	
	public Class(){
		
	}
	
	

	public Class(String idClass, List<Comment> listComment) {
		super();
		this.idClass = idClass;
		this.listComment = listComment;
	}



	public List<Comment> getListComment() {
		return listComment;
	}



	public void setListComment(List<Comment> listComment) {
		this.listComment = listComment;
	}



	public String getIdClass() {
		return idClass;
	}

	public void setIdClass(String idClass) {
		this.idClass = idClass;
	}

	

	@Override
	public String toString() {
		return "Class [idClass=" + idClass + "]";
	}
	
	
}
