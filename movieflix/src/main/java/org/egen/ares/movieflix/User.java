package org.egen.ares.movieflix;

import org.springframework.stereotype.Component;

@Component
public class User implements IUser{

	private String Id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String emailId;
	private String mobileNumber;
	//private Address address;
	private String UserId;
	private String password;	
	
	public IUser createUser(String user) {
		// TODO Auto-generated method stub
		return null;
	}

	public IUser getUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public IUser updateUserDetails(String user) {
		// TODO Auto-generated method stub
		return null;
	}

	public IUser deleteUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getUserName(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
