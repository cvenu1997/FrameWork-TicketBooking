package com.Ticket.BookingTicketDao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Ticket.BookingTicketDto.PersonDto;


public class PassportDao {
		 
	public void savePersonDetails(PersonDto person) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(person);
		transaction.commit();
	}

}
