package org.egen.ares.controllers;

import org.egen.ares.movieflix.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController implements IUserController {

	@Autowired
	//private IUserDataStore userDataStore;
	
	@RequestMapping(method = RequestMethod.POST, produces = "application/json")
	public IUser createUser(@RequestBody String user) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "application/json")
	public IUser getUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(value = "{id}", method = RequestMethod.POST, produces = "application/json")
	public IUser modifyUser(String user) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(value = "{id}", method = RequestMethod.GET, produces = "application/json")
	public IUser deleteUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
