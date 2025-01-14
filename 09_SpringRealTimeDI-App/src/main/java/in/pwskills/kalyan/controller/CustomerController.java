 package in.pwskills.kalyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.pwskills.kalyan.beans.CustomerDTO;
import in.pwskills.kalyan.beans.CustomerVO;
import in.pwskills.kalyan.service.ICustomerService;

@Component("controller")
public class CustomerController {
	
	//Controller Layer needs Service Layer object (perform field Injection using @AutoWired)
	
	@Autowired
	private ICustomerService service;
	
	
	public String processCustomer(CustomerVO vo) throws Exception{
		
		//converting VO to Dto for Service Layer
		
		CustomerDTO dto = new CustomerDTO();
		dto.setCustName(vo.getCustName());
		dto.setCustAddr(vo.getCustAddr());
		dto.setPamt(Float.parseFloat(vo.getPamt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		
		return service.calculateSimpleInterest(dto);
		
		
	}
}
