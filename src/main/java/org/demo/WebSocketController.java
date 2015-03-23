package org.demo;

import javax.annotation.PostConstruct;

import org.apache.commons.io.IOUtils;
import org.demo.domain.FlightUpdate;
import org.demo.domain.Message;
import org.demo.domain.VanUpdate;
import org.demo.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

	@Autowired
	private SimpMessagingTemplate template;
	
	@Autowired
	private FlightService flightService;

	@PostConstruct
	private void init() {
		template.setDefaultDestination("/topic/messages");
	}
	
    @MessageMapping("/init")
    public void request() throws Exception {
		for (FlightUpdate flightUpdate : flightService.getAllFlights()) {
			sendFlightUpdate(flightUpdate);
		}
		VanUpdate vanUpdate = new VanUpdate();
		vanUpdate.setVanId("V495");
		vanUpdate.setLatitude(38.166315);
		vanUpdate.setLongitude(-85.729198);
		sendVanUpdate(vanUpdate);
    }
    
    @MessageMapping("/pickUp")
    public void pickUp() throws Exception {
    	try {
    		String vans = IOUtils.toString(this.getClass().getClassLoader().getResourceAsStream("vans.txt"));
    		for (String van : vans.split("\r\n")) {
    			VanUpdate vanUpdate = new VanUpdate();
    			String[] items = van.split(" ");
    			vanUpdate.setVanId(items[0]);
    			vanUpdate.setLatitude(Double.parseDouble(items[1]));
    			vanUpdate.setLongitude(Double.parseDouble(items[2]));
    			sendVanUpdate(vanUpdate);
    			Thread.sleep(Long.parseLong(items[3]) * 1000);
    		}
    		FlightUpdate flightUpdate = flightService.getAllFlights().get(2);
    		flightUpdate.setImageId(2);
    		sendFlightUpdate(flightUpdate);
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    
    public void sendFlightUpdate(FlightUpdate flightUpdate) {
		template.convertAndSend(new Message("flightUpdate", flightUpdate));
    }

    public void sendVanUpdate(VanUpdate vanUpdate) {
    	template.convertAndSend(new Message("vanUpdate", vanUpdate));
    }
}
