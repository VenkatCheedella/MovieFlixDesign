package org.egen.ares.movieflix;

public interface IUser {
	
	public IUser createUser(String user);
	public IUser getUser(String id);
	public String getUserName(String id);
	public IUser updateUserDetails(String user);
	public IUser deleteUser(String id);
}
