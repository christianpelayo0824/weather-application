package io.weather.webapp;

import java.io.InputStream;
import java.util.List;

import org.jboss.logging.Logger;
import org.jboss.logging.Logger.Level;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.weather.webapp.entity.Location;
import io.weather.webapp.facade.LocationFacade;

@SpringBootApplication(scanBasePackages = { "io.weather.webapp" })
@EnableJpaRepositories(basePackages = { "io.weather.webapp" })
@EntityScan(basePackages = { "io.weather.webapp" })
public class WebappApplication implements CommandLineRunner {

	private LocationFacade locationService;

	/**
	 * @param locationService
	 */
	public WebappApplication(LocationFacade locationService) {
		super();
		this.locationService = locationService;
	}

	private final Logger logger = Logger.getLogger(WebappApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		TypeReference<List<Location>> typeReference = new TypeReference<List<Location>>() {
		};
		InputStream inputStream = TypeReference.class.getResourceAsStream("/static/resource/map/city.list-2.json");
		try {
			List<Location> listLocation = objectMapper.readValue(inputStream, typeReference);
			this.locationService.saveBatchLocation(listLocation);
			logger.log(Level.INFO, "Location saved!");
		} catch (Exception e) {
			logger.log(Level.ERROR, e);
		}

	}

}
