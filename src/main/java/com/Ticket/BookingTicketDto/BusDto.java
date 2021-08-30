package com.Ticket.BookingTicketDto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="bus_details")
public class BusDto implements Serializable{
	@Id
	@GenericGenerator(name = "vini", strategy = "increment")
	@GeneratedValue(generator="vini")
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="timings")
	private double  timings;
	
	@Column(name="fromTo")
	private String fromTo;
	
	@Column(name="destination")
	private String destination;
	
	@Column(name="price")
	private int price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTimings() {
		return timings;
	}

	public void setTimings(double timings) {
		this.timings = timings;
	}

	public String getFromTo() {
		return fromTo;
	}

	public void setFromTo(String fromTo) {
		this.fromTo = fromTo;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BusDto [id=" + id + ", name=" + name + ", timings=" + timings + ", fromTo=" + fromTo + ", destination="
				+ destination + ", price=" + price + "]";
	}
	
	
	
	

}
