package one.microstream.storage;

import java.util.ArrayList;
import java.util.List;

import one.microstream.domain.User;


public class DataRoot
{
	private List<User> users = new ArrayList<User>();
	
	public List<User> getUsers()
	{
		return users;
	}
	
	public void setUsers(List<User> users)
	{
		this.users = users;
	}
	
	public void clear()
	{
		users.clear();
	}
}
