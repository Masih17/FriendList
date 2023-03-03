package com.example.FriendList.domain;

public class Friend {

	private String name;
	//private String lastName;


//	public Friend(String name, String lastName) {
//		super();
//		this.name = name;
//		this.lastName = lastName;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + "]";
	}

//	public String getLastname() {
//		return lastName;
//	}
//
//	public void setLastname(String lastname) {
//		this.lastName = lastname;
//	}

}
