package org.kk.spring.boot.service;

import java.util.List;

public interface Address {

	public AddressService saveAddress(AddressService address);
	
	public List<AddressService> getAllAddress();
}
