package com.gyantey.algotradeapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gyantey.algotradeapi.entities.BrokerRegistration;
import com.gyantey.algotradeapi.service.BrokerRegistrationService;



@RestController
@RequestMapping("/broker")
public class BrokerAPIRegistration 
{
	
	@Autowired
	private BrokerRegistrationService brokerRegistrationService;
	
	@GetMapping("/getBroker")
	public BrokerRegistration getBroker()
	{
		BrokerRegistration broker = brokerRegistrationService.getBroker();
		return broker;
		
	}
	
	@GetMapping("/createBroker")
	public BrokerRegistration createBroker(BrokerRegistration broker)
	{
		BrokerRegistration cbroker = brokerRegistrationService.createBroker(broker);
		return cbroker;
		
	}
	

}
