package in.pwskills.kalyan.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Flipkart {
	
	@Autowired
	@Qualifier(value = "DTDC") // using Qualifier is the best approach
	private ICourier courier;

	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + "]";
	}
	
	
	
}	
