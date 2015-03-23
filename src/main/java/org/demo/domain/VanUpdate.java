package org.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class VanUpdate {
	private String vanId;
	private double latitude;
	private double longitude;
	private List<Crew> crews = new ArrayList<Crew>();
	
	public String getVanId() {
		return vanId;
	}

	public void setVanId(String vanId) {
		this.vanId = vanId;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public List<Crew> getCrews() {
		return crews;
	}

	public void setCrews(List<Crew> crews) {
		this.crews = crews;
	}
}
