package com.FacebookPost;

public class Facebook {
	private Integer fbid;
	private String fbusername;
	private Post ParentObject;
	
	public Integer getFbid() {
		return fbid;
	}
	public void setFbid(Integer fbid) {
		this.fbid = fbid;
	}
	public String getFbusername() {
		return fbusername;
	}
	public void setFbusername(String fbusername) {
		this.fbusername = fbusername;
	}
	public Post getParentObject() {
		return ParentObject;
	}
	public void setParentObject(Post parentObject) {
		ParentObject = parentObject;
	}
}
