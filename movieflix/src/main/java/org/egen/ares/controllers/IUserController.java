package org.egen.ares.controllers;

import org.egen.ares.movieflix.IUser;

public interface IUserController {
	
	public IUser createUser(String user);
	public IUser getUser(String id);
	public IUser modifyUser(String user);
	public IUser deleteUser(String id);
}
