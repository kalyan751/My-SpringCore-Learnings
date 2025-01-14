package in.pwskills.kalyan.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//this is our Target object
@Component
public class Flipkart {
	
	static {
		System.out.println("Flipkart.class file is loading...");
	}
	
	public Flipkart(){
		System.out.println("Flipkart object is created...");
	}
	
	@Autowired
	@Qualifier("ekart")
	private ICourier courier;
	
	
	// Flipkart class has some methods
	
	//here total bill amt we have to give to the user
	public String shopping(String[] items, float[] prices) {
		
		System.out.println("Flipkart.shopping()");
		
		float billAmt = 0.00f;
		
		for(float cost : prices) {
			billAmt += cost;
		}
		
		String msg = courier.deliver(new Random().nextInt(1000));
		
		return Arrays.toString(items) + " with prices "+ Arrays.toString(prices) + " having billAmout :: " + billAmt + " :: " + msg;
	}
}
