
package com.Lap.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity(name="category")
public class Category
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	
	
	@Column
	private String cname;
	
	
	@Column
	private String cdesc;
	

	
    public int getcid()
	{
	return cid;
	}
	public void setcid(int cid) 
	{
	this.cid = cid;
	}
	
	

	
	
	
	public String getcdesc()
	{
	return cdesc;
	}
	public void setcdesc(String cdesc)
	{
	this.cdesc = cdesc;
	}

	
	
	

	
	public String getcname()
	{
	return cname;
	}
    public void setcname(String cname) 
	{
	this.cname = cname;
	}

	  

	
}
