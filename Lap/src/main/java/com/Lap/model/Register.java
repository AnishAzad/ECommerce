/*package com.Lap.model;

	import javax.persistence.Column;
	import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import javax.validation.Valid;

	@Entity(name="Register")
	public class Register 
	{

		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private String userid;
		
		

	
	
	@NotEmpty(message="UserName is Mandatory")
	//@Column(unique=true)
	@Column(name="Username")
	private String username;
	
	@NotEmpty(message="Password is Mandatory")

	@Column(name="Password")
	private String password;
	
	@Column
	private String name;

public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}
@Size(min=10,max=10)
	private String mobno;
	

@Column(unique=true,nullable=false)
@NotEmpty
@Email
	private String email;

	@Column
	String addrs;

	public boolean checkLogin()
	{
	if (username.equals("anish") && password.equals("345"))
		return true;
	else
		return false;
	}



	

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

	
	public String getUsername()
	{
	return username;
	}
    public void setUsername(String username)
    {
	this.username = username;
	}


	public String getPassword() 
	{
	return password;
	}
    public void setPassword(String password) {
	this.password = password;
	}
     
    
   

	
    public String getMobno()
    {
	return mobno;
	}
    public void setMobno(String mobno) 
    {
	this.mobno = mobno;
	}

	public String getEmail()
	{
	return email;
	}
	public void setEmail(String email)
	{
	this.email = email;
	}

	
	public String getAddrs()
	{
	return addrs;
	}
	public void setAddrs(String addrs)
	{
	this.addrs = addrs;
	}

}



*/


package com.Lap.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Register 
{
	
@Id	
String userid;
@Column
String name;
@Column
long mobno;
@Column
String email;

@Column
String addrs;

@Transient
String password;



public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


public String getUserid() {
	return userid;
}


public void setUserid(String userid) {
	this.userid = userid;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public long getMobno() {
	return mobno;
}

public void setMobno(long mobno) {
	this.mobno = mobno;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public String getAddrs() {
	return addrs;
}
public void setAddrs(String addrs) {
	this.addrs = addrs;
}

}
