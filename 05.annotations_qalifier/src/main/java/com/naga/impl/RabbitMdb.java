package com.naga.impl;

import org.springframework.stereotype.Component;

import com.naga.bean.MessageQueueMDB;

@Component("RabbitMQ")
public class RabbitMdb implements MessageQueueMDB {

	public String processMessage(String message) {
		return "Processing from RabbitMq MDB: "+message;
	}

}
