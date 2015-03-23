package org.demo.service;

import java.util.Arrays;
import java.util.List;

import org.demo.domain.FlightUpdate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class FlightService {
	public List<FlightUpdate> getAllFlights() {
		
		try {
			ObjectMapper mapper = new ObjectMapper();
			return Arrays.asList(mapper.readValue(
					this.getClass().getClassLoader().getResourceAsStream("flights.json"), FlightUpdate[].class));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

//		List<FlightUpdate> flightUpdates = new ArrayList<FlightUpdate>();
//		
//		FlightUpdate flightUpdate = new FlightUpdate();
//		flightUpdate.setScheduleDepartureTime(DateTime.now());
//		flightUpdate.setFlightNumber("UPS1234");
//		flightUpdate.setTailNumber("N1234UP");
//		flightUpdate.setOrigin("SDF");
//		flightUpdate.setDestination("LAX");
//		flightUpdate.setParkingPosition("S4");
//		flightUpdate.setLatitude("38.170331");
//		flightUpdate.setLongitude("-85.737431");
//		
//		Crew crew = new Crew();
//		crew.setGemsId("0555111");
//		crew.setFirstName("John");
//		crew.setLastName("Doe");
//		crew.setPosition("CPT");
//		crew.setStatus("onboard");
//
//		flightUpdate.getCrews().add(crew);
//		
//		flightUpdates.add(flightUpdate);
//		
//		return flightUpdates;
	}
}
