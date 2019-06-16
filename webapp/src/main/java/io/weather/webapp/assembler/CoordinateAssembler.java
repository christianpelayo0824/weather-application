/**
 * 
 */
package io.weather.webapp.assembler;

import org.modelmapper.ModelMapper;

import io.weather.webapp.dto.CoordinateDTO;
import io.weather.webapp.entity.Coordinate;

/**
 * @author christian
 *
 */
public class CoordinateAssembler {

	/**
	 * This method is use to convert </br>
	 * Coordinate DTO to an Entity Object.
	 * 
	 * @param coordinateDTO
	 * @return the Coordinate entity
	 */
	public static Coordinate toEntity(CoordinateDTO coordinateDTO) {
		ModelMapper modelMapper = new ModelMapper();
		Coordinate coordinate = modelMapper.map(coordinateDTO, Coordinate.class);
		coordinate.setLon(coordinateDTO.getLon());
		coordinate.setLat(coordinateDTO.getLat());
		return coordinate;
	}

	public static CoordinateDTO toDTO(Coordinate coordinate) {
		ModelMapper modelMapper = new ModelMapper();
		CoordinateDTO coordinateDTO = modelMapper.map(coordinate, CoordinateDTO.class);
		coordinate.setLat(coordinate.getLat());
		coordinate.setLon(coordinate.getLon());
		return coordinateDTO;
	}
}
