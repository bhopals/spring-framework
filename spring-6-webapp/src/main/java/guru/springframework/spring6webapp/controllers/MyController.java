package guru.springframework.spring6webapp.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public static String sayHello() {
		System.out.println("I am in MyController");
		return "Hello MyController";
	}
}
