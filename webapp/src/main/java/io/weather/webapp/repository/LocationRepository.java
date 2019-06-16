/**
 * 
 */
package io.weather.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.weather.webapp.entity.Location;

/**
 * @author christian
 *
 */
public interface LocationRepository extends JpaRepository<Location, Long> {

}
