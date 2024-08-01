package in.pwskills.kalyan.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dtdc implements ICourier {

	static {
		System.out.println("Dtdc.class file is loading");
	}
	
	public Dtdc(){
		System.out.println("Dtdc object is created...");
	}
	@Override
	public String deliver(int oid) {
		String msg = "Delivering " + oid + "Order id order products using Dtdc";

		return msg;
	}

}
