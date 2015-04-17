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
	}
}
