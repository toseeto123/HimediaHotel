package com.hotel.vo;

import java.sql.Timestamp;

public class hotelVO {
	String name, id, pass, email,lev,phone,title, content, starpoint;
	int num, readcount;
	private Timestamp writedate;

	public String getName() {
		return name;
	}

	public String getStarpoint() {
		return starpoint;
	}

	public void setStarpoint(String starpoint) {
		this.starpoint = starpoint;
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

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getReadcount() {
		return readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	public Timestamp getWritedate() {
		return writedate;
	}

	public void setWritedate(Timestamp timestamp) {
		this.writedate = timestamp;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLev() {
		return lev;
	}

	public void setLev(String lev) {
		this.lev = lev;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "hotelVO [name=" + name + ", id=" + id + ", pass=" + pass + ", email=" + email + ", lev=" + lev
				+ ", phone=" + phone + ", title=" + title + ", content=" + content + ", starpoint=" + starpoint
				+ ", num=" + num + ", readcount=" + readcount + ", writedate=" + writedate + "]";
	}

	

}
