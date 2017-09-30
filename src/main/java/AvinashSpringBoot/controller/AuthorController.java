package AvinashSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import AvinashSpringBoot.repositories.AuthorRepository;
import AvinashSpringBoot.repositories.BookRepository;

@Controller
public class AuthorController {
	private AuthorRepository authorrepo;
	
	public AuthorController(AuthorRepository authorrepo)
	{
		this.authorrepo = authorrepo;
	}
	
	@RequestMapping("/authors")
	public String getbooks(Model model)
	{
		model.addAttribute("authors",authorrepo.findAll());
		
		return "authors";
	}

}
