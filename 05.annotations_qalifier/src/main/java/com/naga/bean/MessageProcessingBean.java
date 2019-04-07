package com.naga.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("messageProcessing")
public class MessageProcessingBean {
	
	
	@Autowired
//	@Qualifier("Rtgs")
//	@Qualifier("neft")
	@Qualifier("RabbitMQ")
	MessageQueueMDB mdb;
	
	public String processMessage(String message) {
		
		return mdb.processMessage(message);
	}

}
