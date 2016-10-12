package br.com.rafael.barros.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rafael.barros.Hello;

@Controller
public class HelloWorld {

	@RequestMapping("/hello-world")
	public String executa(){
		
		Hello.helloWorld(); // show in console
		
		return "hello-world";
	}
}
