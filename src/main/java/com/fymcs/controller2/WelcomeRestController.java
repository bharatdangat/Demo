package com.fymcs.controller2;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173")

@RestController  //All Methods Return Response..
public class WelcomeRestController 
{
	
  @GetMapping("/restwelcome")
  public String Welcomemsg()
  {
	  return "Welcome To Rest API...";
  }
  @GetMapping("/greet")
  public String greet()
  {
	  return "Good Morning...";
  }
  @GetMapping("/msg")
  public String msg()
  {
	  return "We Use @RestController";
  }
 
}
