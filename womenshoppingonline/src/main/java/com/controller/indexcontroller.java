package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.daoimpl.Userdaoimpl;
import com.model.User;

@Controller
public class indexcontroller 
{
	@Autowired
	Userdaoimpl userdaoimpl;
	
	@RequestMapping ("/")
	public String index()
	{
		return "index";
	}

	@RequestMapping(value="/goToRegister", method=RequestMethod.GET)
	public ModelAndView goToRegister()
	
	{
	ModelAndView mv=new ModelAndView();
	mv.addObject("user", new User());
	mv.setViewName("register");
	return mv;
	
	}
	
	

	@RequestMapping (value="/saveRegister", method=RequestMethod.POST)
	public ModelAndView saveRegister(@ModelAttribute("user") User user,BindingResult result)
	{
			ModelAndView mv=new ModelAndView();
	
			
	if(result.hasErrors())
		{
			mv.setViewName("register");
		
		}
	else
	{
		user.setRoll("ROLE_USER");
		userdaoimpl.addUser(user);	
		mv.setViewName("index");
		
				
	}
	return mv;
}
	
}