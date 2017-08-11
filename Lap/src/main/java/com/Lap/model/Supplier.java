
package com.Lap.model;

import java.util.Set;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity(name="supplier")
public class Supplier
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sid;
	
	
	@Column
	private String sname;
	
	
	@Column
	private String sdesc;
	

	
   public int getsid()
	{
	return sid;
	}
	public void setsid(int sid) 
	{
	this.sid = sid;
	}
	
	
	
	public String getsdesc()
	{
	return sdesc;
	}
	public void setsdesc(String sdesc)
	{
	this.sdesc = sdesc;
	}

	
	
		
	public String getsname()
	{
	return sname;
	}
   public void setsname(String sname) 
	{
	this.sname = sname;
	}

	
}
