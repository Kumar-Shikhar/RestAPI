package org.shikhar.java_rest.messenger.model;

import java.util.Date;

public class Profile {
	private long id;
	private String Profilename;
	private String firstname;
	private String lastname;
	private Date created;
	
	public Profile(long id, String profilename, String firstname,
			String lastname) {
		this.id = id;
		Profilename = profilename;
		this.firstname = firstname;
		this.lastname = lastname;
	
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProfilename() {
		return Profilename;
	}
	public void setProfilename(String profilename) {
		Profilename = profilename;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
}
