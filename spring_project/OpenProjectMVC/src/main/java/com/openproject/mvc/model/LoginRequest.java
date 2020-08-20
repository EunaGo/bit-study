package com.openproject.mvc.model;

public class LoginRequest {
	
	private String uid;
	private String upw;
	private String uphoto;
	
	public LoginRequest(String uid, String upw, String uphoto) {
		this.uid = uid;
		this.upw = upw;
		this.uphoto = uphoto;
	}
	public LoginRequest() {
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
	public String getUphoto() {
		return uphoto;
	}
	public void setUphoto(String uphoto) {
		this.uphoto = uphoto;
	}
	@Override
	public String toString() {
		return "LoginRequest [uid=" + uid + ", upw=" + upw + ", uphoto=" + uphoto + "]";
	}
	
	
}
