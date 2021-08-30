package com.Ticket.BookingTicket;

import java.util.*;
import java.util.Date;

import com.Ticket.BookingTicketDao.BrandDao;
import com.Ticket.BookingTicketDao.BusDao;
import com.Ticket.BookingTicketDao.PassportDao;
import com.Ticket.BookingTicketDao.TicketDao;
import com.Ticket.BookingTicketDto.BrandDto;
import com.Ticket.BookingTicketDto.BusDto;
import com.Ticket.BookingTicketDto.ModelDto;
import com.Ticket.BookingTicketDto.PassportDto;
import com.Ticket.BookingTicketDto.PersonDto;
import com.Ticket.BookingTicketDto.TicketDto;
import com.update.Update;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	TicketDto ticketDto = new TicketDto();
//    	ticketDto.setId(1);
//    	ticketDto.setFromTo("kurnool");
//    	ticketDto.setDestination("hyderabad");
//    	ticketDto.setNoOfPassangers(8);
//    	ticketDto.setPrice(450);
//    	ticketDto.setStatus("waiting");
//    	ticketDto.setTravel_date("26-1-2021");
//    	   TicketDao ticketDao=new TicketDao();
//    	   ticketDao.bookTicket(ticketDto);
//        System.out.println( ticketDao.getBy(1) );   //for get method this line enough//
    	    
    	  //for update//
//    	   Update upd=new Update();
//         upd.setStatus("confirmed");
//         ticketDao.updateBy(upd,2);
    	   
//    	   ticketDao.deleteBusTicketBy(1);
    	   
//    	   ****-----bus details-------****
    	   
//    	  BusDto busDto=new BusDto(); 
//    	  busDto.setName("OrangeTravels");
//    	  busDto.setTimings(12.00);
//    	  busDto.setPrice(300);
//    	  busDto.setFromTo("kurnool");
//    	  busDto.setDestination("Amaravathi");
    	  
//    	  BusDao busDao=new BusDao();
//    	  busDao.busDetails(busDto);
    	  
    	  // to get busdetails//
//    	  System.out.println(busDao.getBusDetailsBy(1));
    	  
    	  // one to one //
//    	  PassportDto passport = new PassportDto();
//      	passport.setPassportNumber("NHIND123456");
//      	passport.setNationality("Indian");
//      	passport.setDateOfIssue(new Date());
//      	passport.setExpiryDate(new Date());
//      	
//      	PersonDto person = new PersonDto();
//      	person.setName("prajwal");
//      	person.setAge(23);
//      	person.setEmail("prajwal@domain.com");
//      	person.setMobileNumber("9182679947");
//      	person.setPassport(passport);
//      	
//      	PassportDao dao = new PassportDao();
//      	dao.savePersonDetails(person);
    		
    	//one to many relation//
    	
    	
    	BrandDto brand = new BrandDto();
		brand.setName("Mahindra");
		brand.setStartedYear(new Date());
		brand.setFeatures("Good Quality");
		brand.setOriginCountry("India");
		brand.setType("cars");
		
		ModelDto model = new ModelDto();
		model.setName("scorpio");
		model.setColor("bloack");
		model.setPrice(120000.00);
		model.setManufactureDate(new Date());
		model.setCategory("suv");
		
		ModelDto model1 = new ModelDto();
		model1.setName("xuv-600");
		model1.setColor("white");
		model1.setPrice(14000.00);
		model1.setManufactureDate(new Date());
		model.setCategory("suv");
		
		List<ModelDto> list = new ArrayList<ModelDto>();
		list.add(model);
		list.add(model1);
		
		brand.setModels(list);
		BrandDao brandDao=new BrandDao();
		brandDao.saveBrandDetails(brand);

    }
}
