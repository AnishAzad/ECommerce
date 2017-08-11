package com.Lap.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.Lap.dao.Cartdao;
import com.Lap.dao.Productdao;
import com.Lap.dao.Registerdao;
import com.Lap.model.Address;
import com.Lap.model.Cart;
import com.Lap.model.Product;
import com.Lap.model.Register;
import com.google.gson.Gson;


@Controller
public class CartController 
{
	@Autowired
	Cartdao dao1;
	
	@Autowired
	Productdao dao;
	
	@Autowired
	Registerdao n;
	
	@RequestMapping(value="/payment",method = RequestMethod.GET)
	public String payment(HttpSession session,Model M) 
	{
		return "payment";
	}
	
	
	public double getTotal(ArrayList<Cart> cd)
	{
	ListIterator<Cart> itr=cd.listIterator();
	double grandtotal=0;
	while(itr.hasNext())
	{
	Cart cd1=(Cart)itr.next();
	grandtotal=grandtotal+(cd1.getQty()*cd1.getPrice());
	}
	return grandtotal;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/checkout",method = RequestMethod.POST)
	public String checkout(HttpSession session,Address a,Model M) 
	{
		ArrayList<Cart> cartobj=(ArrayList<Cart>)session.getAttribute("mycart");
		Gson g=new Gson();
		String l=g.toJson(cartobj);
		M.addAttribute("cart", l);
		session.setAttribute("mycart", cartobj);
		String l1=g.toJson(a);
		System.out.println(l1);
		M.addAttribute("user", l1);		
		session.setAttribute("userdetails1",a);
		session.setAttribute("userdetails",l1);
		session.setAttribute("gtotal",getTotal(cartobj));
		return "checkout";
	}
	
	@RequestMapping(value="/billingAddress",method = RequestMethod.GET)
	public ModelAndView billingAddress(HttpSession session)
	{
		System.out.println("A");
		
		String UserName=session.getAttribute("Username").toString();
		System.out.println("A");
		Register user=n.getInfo(UserName);
		System.out.println("b");
		Address a=new Address();
		System.out.println("c");
		a.setName(user.getName());
		System.out.println("d");
		a.setNumber(user.getMobno());
		System.out.println("e"); 
		a.setEmail(user.getEmail());
		System.out.println("f");
		ModelAndView mv=new ModelAndView("billingAddress","Address",a);
		System.out.println("g");
		return mv;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/cart",method = RequestMethod.GET)
	public ModelAndView showcart(@RequestParam("adpid") int apid,HttpSession session) 
	{
		Product adp = dao.showProduct(apid);
		Cart cd = new Cart();
		cd.setPid(adp.getPid());
		cd.setPname(adp.getPname());
		cd.setPrice(adp.getPcost());
		ArrayList<Cart> li=(ArrayList<Cart>)session.getAttribute("mycart");
		li.add(cd);
		int size = li.size();
	
		session.setAttribute("count", size);
		ModelAndView mv = new ModelAndView("cart", "CartDetail", new Cart());
		// mv.addObject("cart", gs);
		mv.addObject("cartitm",li);
		session.setAttribute("gtotal",String.valueOf(getTotal(li)));
		System.out.println(session.getAttribute("cart"));
		return mv;
		//Gson g=new Gson();
		//String l=g.toJson(li);
		//M.addAttribute("cart", l);
		//M.addAttribute("cartitm",li);
		//session.setAttribute("gtotal",String.valueOf(getTotal(li)));
		//return "cart";
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/addcart",method = RequestMethod.GET)
	public String addCart(@RequestParam("adpid")int id,HttpSession session,Model M) 
	{
		ArrayList<Cart> li = (ArrayList<Cart>) session.getAttribute("mycart");
		Product p=dao.showProduct(id);
		Cart c=new Cart();
		System.out.println(p.getPid());
		c.setPid(p.getPid());
		System.out.println(p.getPname());
		c.setPname(p.getPname());
		c.setPrice(p.getPcost());
		c.setQty(1);
		c.setTotal(p.getPcost());		
		List<Cart> cartobj=(ArrayList<Cart>)session.getAttribute("mycart");
		cartobj.add(c);
		Gson g=new Gson();
		System.out.println("Hi");
		String l=g.toJson(cartobj);
		session.setAttribute("mycart", cartobj);
		System.out.println("Hi1");
		M.addAttribute("cart", cartobj);
		M.addAttribute("cartitm",li);
		session.setAttribute("gtotal",String.valueOf(getTotal(li)));
		System.out.println(p.getPname());
		return "cart";
	}
	
	
	@RequestMapping(value="/removeitem",method = RequestMethod.GET)
	public ModelAndView removeCart(@RequestParam("pid") int id,HttpSession session) 
	{
		//ArrayList<Cart> li = (ArrayList<Cart>) session.getAttribute("mycart");
		ArrayList<Cart> ld=(ArrayList<Cart>)session.getAttribute("mycart");
		ListIterator<Cart> lit=(ListIterator<Cart>) ld.listIterator();
		while(lit.hasNext())
		{
		Cart d=lit.next();
		if(d.getPid()==id)
		{
		ld.remove(ld.indexOf(d));
		break;
		}
		}
		session.setAttribute("mycart",ld);
		ModelAndView mv = new ModelAndView("cart", "cart", new Cart());
		Gson gsonli = new Gson();
		String gs = gsonli.toJson(ld);
		mv.addObject("cart",gs);
		mv.addObject("cartitm",ld);
		session.setAttribute("gtotal",String.valueOf(getTotal(ld)));
		return mv;
	}
   
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/updateqty", method = RequestMethod.GET)
	public String updateqty(@RequestParam("qty")int qty,@RequestParam("pid")int pid,HttpSession session,Model m) 
	{

	 System.out.println("Quantity:"+qty);
	 System.out.println("Product ID:"+pid);
	ArrayList<Cart> li = (ArrayList<Cart>) session.getAttribute("mycart");
	ListIterator<Cart> lit = (ListIterator<Cart>) li.listIterator();
	while (lit.hasNext()) 
	{
	Cart d = lit.next();
	if (d.getPid() == pid) 
	{
	d.setQty(qty);
	lit.set(d);
	break;
	}
	}

	m.addAttribute("cartitm",li);
	session.setAttribute("gtotal",String.valueOf(getTotal(li)));
	return "cart";

	}


}
