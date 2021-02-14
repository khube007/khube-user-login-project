package org.kk.spring.boot.service;

import java.util.List;

import org.kk.spring.boot.model.Address;

public interface AddressService {

	public Long saveAddress(Address address);
	
	public List<Address> getAllAddress();
	
	public Address getById(Long aid);

	public void addressUpdate(Address address);
	
	public void deleteAddress(Long aid);
}
