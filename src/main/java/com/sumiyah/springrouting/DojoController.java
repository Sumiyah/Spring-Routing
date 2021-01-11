package com.sumiyah.springrouting;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DojoController {

	@RequestMapping("/{dojo}")
	public String dojo(@PathVariable("dojo") String dojo) {
		
		if ( dojo == "san-josE") {
			return "<h1>"+ dojo + "dojo is the headquarters of Coding Dojo!!</h1>";
			
		} else if ( dojo == "burbank-dojo") {
			return  "<h1>"+ dojo +"is located in Southern California!</h1>";
			
		} else {
			return "<h1>The " + dojo + " is awesome!</h1>";	
		}	
	}
	
	@RequestMapping("/burbankdojo")
	public String burbankDojo() {
		return  "<h1>Burbank Dojo is located in Southern California!</h1>";
	}
	
	@RequestMapping("/sanjose")
	public String sanJose() {
		return "<h1>San Jose Dojo is the headquarters of Coding Dojo!!</h1>";
	}
}
