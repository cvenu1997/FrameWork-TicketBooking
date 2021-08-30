package com.Ticket.BookingTicketDao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.SingleTon.SingleTonOfSession;
import com.Ticket.BookingTicketDto.BusDto;
import com.Ticket.BookingTicketDto.TicketDto;

public class BusDao {
	
	
	
	SingleTonOfSession sf;
	
	public void busDetails(BusDto bus) {
		Session session=sf.getInstance().openSession();
		Transaction t=session.beginTransaction();
		session.save(bus);
		t.commit();
	}
		
	public BusDto getBusDetailsBy(int id) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure(); 
		cfg.addAnnotatedClass(BusDto.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		return session.get(BusDto.class, id);
		
	}
}
