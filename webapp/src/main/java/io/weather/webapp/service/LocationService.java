/**
 * 
 */
package io.weather.webapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import io.weather.webapp.entity.Location;
import io.weather.webapp.facade.LocationFacade;
import io.weather.webapp.repository.LocationRepository;

/**
 * @author christian
 *
 */
@Service
public class LocationService implements LocationFacade {

	private LocationRepository locationRepository;

	/**
	 * @param locationRepository
	 */
	public LocationService(LocationRepository locationRepository) {
		super();
		this.locationRepository = locationRepository;
	}

	@Override
	public Location createLocation(Location location) {
		return this.locationRepository.save(location);
	}

	@Override
	public List<Location> getAllLocation() {
		return this.locationRepository.findAll();
	}

	@Override
	public Iterable<Location> saveBatchLocation(List<Location> location) {
		return this.locationRepository.saveAll(location);
	}

	@Override
	public Optional<Location> getLocationById(long id) {
		return this.locationRepository.findById(id);
	}

}