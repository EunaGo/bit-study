package model;

public class LoginInfo {

	private String uid;
	private String uname;

	public LoginInfo(String uid, String uname) {
		this.uid = uid;
		this.uname = uname;

	}

	public String getUid() {
		return uid;
	}



	public String getUname() {
		return uname;
	}


	@Override
	public String toString() {
		return "LoginInfo [uid=" + uid + ", uname=" + uname + "]";
	}

	

}