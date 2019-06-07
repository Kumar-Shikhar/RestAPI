package org.shikhar.java_rest.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.shikhar.java_rest.messenger.model.*;

public class MessageService {
	
	public List<Message> getAllMessages(){
		Message m1 = new Message(1, "Shikhar", "Gupta");
		Message m2 = new Message(2, "Jack", "Jones");
		Message m3 = new Message(1, "Brad", "Hadin");
		
		List< Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		return list;
	}
}
