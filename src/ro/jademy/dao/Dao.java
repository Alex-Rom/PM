package ro.jademy.dao;

import ro.jademy.domain.User;

public interface Dao {

	
	public boolean addUser(User user);
	
	public User getUser(String userName, String password);
	

	


	boolean resetPass(String password, String codReset, String email);
}
