package one.microstream.controller;

import java.util.List;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import one.microstream.domain.User;
import one.microstream.storage.DB;


@Controller("/user")
public class UserController
{
	@Get(value = "/list")
	public List<User> getUsers()
	{
		return DB.root.getUsers();
	}
	
	@Get(value = "/insert")
	public HttpResponse<User> insertUser()
	{
		User user = new User();
		user.setMail("max.mustermann@web.de");
		user.setValid(true);
		
		DB.root.getUsers().add(user);
		DB.store(DB.root.getUsers());
		
		return HttpResponse.created(user);
	}
	
	@Get(value = "/test")
	public String test()
	{
		System.out.println("Funktioniert schon alles SYSOUT");
		
		return "Funktioniert schon alles RETURN";
	}
}
