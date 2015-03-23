package org.demo.domain;

public class VanUpdate {
	private String vanId;
	private String latitude;
	private String longitude;
	private long delay;

	public String getVanId() {
		return vanId;
	}

	public void setVanId(String vanId) {
		this.vanId = vanId;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public long getDelay() {
		return delay;
	}

	public void setDelay(long delay) {
		this.delay = delay;
	}
}
