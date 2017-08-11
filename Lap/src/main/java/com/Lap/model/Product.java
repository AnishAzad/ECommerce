

package com.Lap.model;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;




import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="Product")
@Component
public class Product
{
	
	
	@Id
	/*@GeneratedValue(strategy=GenerationType.AUTO)*/
private int pid;

@NotEmpty(message="Product Name is mandatory")
private String pname;

@NotEmpty(message="Description is Mandatory")
private String pdesc;

@Min(value=5,message="Minimum value of price must be 40000")	
private double pcost;


@Min(value=1,message="minimum qantity must be 4")
private int pquan;
	
	
	@Transient
	MultipartFile pimage;
	

	
	public MultipartFile getPimage() {
		return pimage;
	}

	public void setPimage(MultipartFile pimage) {
		this.pimage = pimage;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

	public double getPcost() {
		return pcost;
	}

	public void setPcost(double pcost) {
		this.pcost = pcost;
	}

	public int getPquan() {
		return pquan;
	}

	public void setPquan(int pquan) {
		this.pquan = pquan;
	}
	
	

	

}