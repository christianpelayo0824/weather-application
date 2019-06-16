/**
 * 
 */
package io.weather.webapp.facade;

import java.util.List;
import java.util.Optional;

import io.weather.webapp.entity.Location;

/**
 * @author christian
 *
 */
public interface LocationFacade {

	Location createLocation(Location location);

	List<Location> getAllLocation();

	Iterable<Location> saveBatchLocation(List<Location> location);

	Optional<Location> getLocationById(long id);

}
