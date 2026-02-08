package com.fymcs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController 
{
 @ResponseBody         //treat as response
 @GetMapping("/welcome1")
 public String Welcomemsg1()
 {
	 return "Welcome To Rest API...";
 }
   
  @GetMapping("/welcome")
  public String Welcomemsg()
  {
	  return "welcome";   //treat as view(welcome page requrired)
  }


}
