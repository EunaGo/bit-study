package member.model;

import java.sql.Date;

public class Member {
	private int member_idx;
	private String member_id;
	private String member_pw;
	private String member_nick;
	private String member_score;
	private Date member_regdate;
	private String member_latitude;
	private String member_longitude;
	private String member_addr;
	private String member_img;
	
	public Member(int member_idx, String member_id, String member_pw, String member_nick, String member_score,
			Date member_regdate, String member_latitude, String member_longitude, String member_addr,
			String member_img) {
		super();
		this.member_idx = member_idx;
		this.member_id = member_id;
		this.member_pw = member_pw;
		this.member_nick = member_nick;
		this.member_score = member_score;
		this.member_regdate = member_regdate;
		this.member_latitude = member_latitude;
		this.member_longitude = member_longitude;
		this.member_addr = member_addr;
		this.member_img = member_img;
	}
	
	public Member() {}

	public int getMember_idx() {
		return member_idx;
	}

	public void setMember_idx(int member_idx) {
		this.member_idx = member_idx;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_pw() {
		return member_pw;
	}

	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}

	public String getMember_nick() {
		return member_nick;
	}

	public void setMember_nick(String member_nick) {
		this.member_nick = member_nick;
	}

	public String getMember_score() {
		return member_score;
	}

	public void setMember_score(String member_score) {
		this.member_score = member_score;
	}

	public Date getMember_regdate() {
		return member_regdate;
	}

	public void setMember_regdate(Date member_regdate) {
		this.member_regdate = member_regdate;
	}
	
	// java.sql.Date -> java.util.Date
	public java.util.Date getToDate() {
		return new java.util.Date(member_regdate.getTime());
	} // ${member.todate}

	public String getMember_latitude() {
		return member_latitude;
	}

	public void setMember_latitude(String member_latitude) {
		this.member_latitude = member_latitude;
	}

	public String getMember_longitude() {
		return member_longitude;
	}

	public void setMember_longitude(String member_longitude) {
		this.member_longitude = member_longitude;
	}

	public String getMember_addr() {
		return member_addr;
	}

	public void setMember_addr(String member_addr) {
		this.member_addr = member_addr;
	}

	public String getMember_img() {
		return member_img;
	}

	public void setMember_img(String member_img) {
		this.member_img = member_img;
	}

	@Override
	public String toString() {
		return "Member [member_idx=" + member_idx + ", member_id=" + member_id + ", member_pw=" + member_pw
				+ ", member_nick=" + member_nick + ", member_score=" + member_score + ", member_regdate="
				+ member_regdate + ", member_latitude=" + member_latitude + ", member_longitude=" + member_longitude
				+ ", member_addr=" + member_addr + ", member_img=" + member_img + "]";
	}
	
	
	
	
}
