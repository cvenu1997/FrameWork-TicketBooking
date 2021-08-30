package com.SingleTon;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Ticket.BookingTicketDto.TicketDto;

public class SingleTonOfSession {
	public static SessionFactory sf;
	private SingleTonOfSession() {
		
	}
	public static SessionFactory getInstance() {
		if (sf==null) {
			sf=new Configuration().configure().addAnnotatedClass(TicketDto.class).buildSessionFactory();
		}
		return sf;
	}

}
