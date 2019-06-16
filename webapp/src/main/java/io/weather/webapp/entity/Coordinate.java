/**
 * 
 */
package io.weather.webapp.entity;

import javax.persistence.Embeddable;

/**
 * @author christian
 *
 */

@Embeddable
public class Coordinate {

	private double lon;
	private double lat;

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

}