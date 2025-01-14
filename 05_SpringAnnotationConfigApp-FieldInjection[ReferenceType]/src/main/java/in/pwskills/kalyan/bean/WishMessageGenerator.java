package in.pwskills.kalyan.bean;


import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//User defined type
@Component(value = "wmg")
public class WishMessageGenerator {
	
	static {
		System.out.println("WishMessageGenerator.class file is  loading...");
	}
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator object is created using zero param constructor...");
	}
	
	// inbuilt type - HAS A relationship
	@Autowired(required = false) // if bean is available link it(ie, inject it) else dont inject it
	private LocalDateTime date ; // this we are considering as the dependent object 
	
	


	
	public String WishMessage(String user) {
		System.out.println("WishMessageGenerator.WishMessage()");
		int hour = date.getHour();
		
		String msg = "";
		
		if(hour < 12) {
			msg += "GoodMorning :: " + user;
		}else if(hour < 16) {
			msg += "Good AfterNoon :: " + user;
		}else if(hour < 20) {
			msg += "Good Evening :: " + user;
		}else {
			msg += "Good Night :: " + user;
		}
		return msg;
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}
	
	
	
	
	
	
	
}
