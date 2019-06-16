/**
 * 
 */
package io.weather.webapp.dto;

/**
 * @author christian
 *
 */
public class LocationDTO {

	private long id;
	private String name;
	private String country;
	private CoordinateDTO coordDTO;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public CoordinateDTO getCoordDTO() {
		return coordDTO;
	}

	public void setCoordDTO(CoordinateDTO coordDTO) {
		this.coordDTO = coordDTO;
	}

}
