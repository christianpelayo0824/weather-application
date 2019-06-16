/**
 * 
 */
package io.weather.webapp.rest.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.jboss.logging.Logger.Level;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.weather.webapp.assembler.LocationAssembler;
import io.weather.webapp.dto.LocationDTO;
import io.weather.webapp.entity.Location;
import io.weather.webapp.facade.LocationFacade;

/**
 * @author christian
 *
 */
@RestController
@RequestMapping(value = "/api/location")
public class LocationController {

	private static Logger logger = Logger.getLogger(LocationController.class.getName());

	private LocationFacade locationService;

	/**
	 * @param locationService
	 */
	public LocationController(LocationFacade locationService) {
		super();
		this.locationService = locationService;
	}

	@GetMapping(value = "/getAllLocation", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Location> getAllLocation() {
		return this.locationService.getAllLocation();
	}

	@GetMapping(value = "/getLocationById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public LocationDTO getLocationById(@PathVariable long id) {
		return this.getLocationById(id);
	}

	@PostMapping(value = "/createLocation", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createLocation(@RequestBody LocationDTO locationDTO) {
		Location location = LocationAssembler.convertToEntity(locationDTO);
		logger.log(Level.INFO, location.getName());
	}

	@PostMapping(value = "/test")
	public String test() {
		return "Test...";
	}

}
