package com.naga.impl;

import org.springframework.stereotype.Component;

import com.naga.bean.MessageQueueMDB;

@Component("neft")
public class NEFTMdb implements MessageQueueMDB {

	public String processMessage(String message) {
		return "Processing from Neft MDB: "+message;
	}

}
