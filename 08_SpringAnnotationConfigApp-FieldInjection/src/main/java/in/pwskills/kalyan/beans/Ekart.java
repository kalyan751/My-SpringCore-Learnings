package in.pwskills.kalyan.beans;

import org.springframework.stereotype.Component;

@Component
public class Ekart implements ICourier {
	static {
		System.out.println("Ekart.class file is loading");
	}
	
	public Ekart(){
		System.out.println("Ekart object is created...");
	}
	
	@Override
	public String deliver(int oid) {
		String msg = "Delivering " + oid + " Order id order products using Ekart";

		return msg;
	}

}