package com.Ticket.BookingTicketDao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.SingleTon.SingleTonOfSession;
import com.Ticket.BookingTicketDto.TicketDto;
import com.update.Update;

public class TicketDao {
	
		SingleTonOfSession sf;
		
	public void bookTicket(TicketDto ticket) {
		Session session=sf.getInstance().openSession();
		Transaction t=session.beginTransaction();
		session.save(ticket);
		t.commit();
		
	}   
	
	
	public TicketDto getBy(int id) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(TicketDto.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		return session.get(TicketDto.class, id);
		
	}
    
	
	public void updateBy(Update up,int id) {
		TicketDto m=getBy(id);
		if(m!=null) {
	   	Session session =sf.getInstance().openSession();
		Transaction t=session.beginTransaction();
		m.setStatus(up.getStatus());
		session.update(m);
		t.commit();
		}else {
			System.out.println("update failure");
		}
	}
	
	public void deleteBusTicketBy(int id) {
		Configuration cfg = new Configuration();
		cfg.configure();
//		cfg.addAnnotatedClass(TicketDto.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		session.delete(id);
		//t.commit();
	}
}
