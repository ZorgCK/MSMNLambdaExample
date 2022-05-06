package one.microstream.domain;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class User
{
	private String	mail;
	private Boolean	valid;
	
	
	public Boolean getValid()
	{
		return valid;
	}

	public void setValid(Boolean valid)
	{
		this.valid = valid;
	}

	public String getMail()
	{
		return mail;
	}
	
	public void setMail(String mail)
	{
		this.mail = mail;
	}
}
