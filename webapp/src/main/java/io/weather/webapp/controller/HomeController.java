/**
 * 
 */
package io.weather.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for the Home where </br>
 * all the end-point can be access
 * 
 * @author christian
 *
 */

@Controller
@RequestMapping(value = "/")
public class HomeController {

	/**
	 * 
	 * @return return the index view </br>
	 *         for Home entity
	 */
	@GetMapping(value = "index")
	public String index() {
		return "index";
	}
}
