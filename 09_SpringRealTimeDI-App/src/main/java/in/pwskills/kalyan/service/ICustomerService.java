package in.pwskills.kalyan.service;

import in.pwskills.kalyan.beans.CustomerDTO;

//service layer will calculate the simple interest
public interface ICustomerService {
	public String calculateSimpleInterest(CustomerDTO dto)throws Exception;
}
