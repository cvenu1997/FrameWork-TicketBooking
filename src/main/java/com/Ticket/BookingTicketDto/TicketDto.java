package com.Ticket.BookingTicketDto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="ticket_details")
public class TicketDto implements Serializable {
	@Id
	@GenericGenerator(name = "venu", strategy = "increment")
	@GeneratedValue(generator="venu")
	@Column(name="id")
		private int id;
		
		@Column(name="fromTo")
		private String fromTo;
		
		@Column(name="destination")
		private String destination;
		
		@Column(name="travel_date")
		private String travel_date;
		
		@Column(name="price")
		private int price;
		
		@Column(name="no_of_passangers")   //acc to datsbase we have to give name//
		private int noOfPassangers;
		
		
		@Column(name="status")
		private String status;



		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
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



		public String getTravel_date() {
			return travel_date;
		}



		public void setTravel_date(String travel_date) {
			this.travel_date = travel_date;
		}



		public int getPrice() {
			return price;
		}



		public void setPrice(int price) {
			this.price = price;
		}



		public int getNoOfPassangers() {
			return noOfPassangers;
		}



		public void setNoOfPassangers(int noOfPassangers) {
			this.noOfPassangers = noOfPassangers;
		}



		public String getStatus() {
			return status;
		}



		public void setStatus(String status) {
			this.status = status;
		}



		@Override
		public String toString() {
			return "TicketDto [id=" + id + ", from=" + fromTo + ", destination=" + destination + ", travel_date="
					+ travel_date + ", price=" + price + ", noOfPassangers=" + noOfPassangers + ", status=" + status
					+ "]";
		}
		
		
		
}
