/**
 * 
 */
package io.weather.webapp.assembler;

import org.jboss.logging.Logger;
import org.modelmapper.ModelMapper;

import io.weather.webapp.dto.LocationDTO;
import io.weather.webapp.entity.Location;

/**
 * @author christian
 *
 */
public class LocationAssembler {

	private static Logger logger = Logger.getLogger(LocationAssembler.class.getName());

	private LocationAssembler() {
		throw new IllegalStateException("LocationAssemler Exception");
	}

	/**
	 * This method is use to convert </br>
	 * Location DTO to and Entity Object.
	 * 
	 * @param locationDTO
	 * @return
	 */
	public static Location convertToEntity(LocationDTO locationDTO) {
		ModelMapper modelMapper = new ModelMapper();
		Location location = modelMapper.map(locationDTO, Location.class);
		location.setId(locationDTO.getId());
		location.setName(locationDTO.getName());
		location.setCountry(locationDTO.getCountry());
		location.setCoord(CoordinateAssembler.toEntity(locationDTO.getCoordDTO()));
		return location;
	}

	public static LocationDTO convertToDTO(Location location) {
		ModelMapper modelMapper = new ModelMapper();
		LocationDTO locationDTO = modelMapper.map(location, LocationDTO.class);
		locationDTO.setId(location.getId());
		locationDTO.setName(location.getName());
		locationDTO.setCountry(location.getCountry());
		locationDTO.setCoordDTO(CoordinateAssembler.toDTO(location.getCoord()));
		return locationDTO;
	}

}
