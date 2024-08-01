package in.pwskills.kalyan.beans;

import org.springframework.stereotype.Component;

@Component
public class FedEx implements ICourier {

	static {
		System.out.println("FedEx.class file is loading");
	}
	
	public FedEx(){
		System.out.println("FedEx object is created...");
	}
	@Override
	public String deliver(int oid) {
		String msg = "Delivering " + oid + "Order id order products using FedEx";

		return msg;
	}

}
