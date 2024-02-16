package com.smart.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

//import com.smart.entities.User;
//import com.smart.repositories.UserRepository;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model model)
	{
		model.addAttribute("title","home - Smart Contact Manager");
	return "home";
	}

	@RequestMapping("/about")
	public String about(Model model)
	{
		model.addAttribute("title","About - Smart Contact Manager");
	return "about";
	}	
}



//	@Autowired
//	private UserRepository userRepository;
//	
//	@GetMapping("/test")
//	@ResponseBody
//	public String test() {
//		
//		User user = new User();
//		user.setName("Ajinkya Bhosale");
//		user.setEmail("bhosaleajinlya1998@gmail.com");
//		
//		userRepository.save(user);
//		return "working";
//	}
