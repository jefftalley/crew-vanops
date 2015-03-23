package org.demo.domain;

import java.util.ArrayList;
import java.util.List;


public class FlightUpdate {
	private String scheduleDepartureTime;
	private String flightNumber;
	private String tailNumber;
	private String origin;
	private String destination;
	private String parkingPosition;
	private int imageId;
	private double latitude;
	private double longitude;
	private List<Crew> crews = new ArrayList<Crew>();
	
	public String getScheduleDepartureTime() {
		return scheduleDepartureTime;
	}

	public void setScheduleDepartureTime(String scheduleDepartureTime) {
		this.scheduleDepartureTime = scheduleDepartureTime;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getTailNumber() {
		return tailNumber;
	}

	public void setTailNumber(String tailNumber) {
		this.tailNumber = tailNumber;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getParkingPosition() {
		return parkingPosition;
	}

	public void setParkingPosition(String parkingPosition) {
		this.parkingPosition = parkingPosition;
	}

	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
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
