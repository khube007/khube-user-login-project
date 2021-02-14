package org.kk.spring.boot.service.impl;

import java.util.List;

import org.kk.spring.boot.model.Address;
import org.kk.spring.boot.repository.AddressRepository;
import org.kk.spring.boot.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	private AddressRepository addressRepository;


	@Transactional
	public Long saveAddress(Address address) {
		return addressRepository.save(address).getAid();
	}

	@Transactional (readOnly = true)
	public List<Address> getAllAddress() {
		return addressRepository.findAll();
	}

	@Transactional (readOnly = true)
	public Address getById(Long aid) {
		return addressRepository.getOne(aid);
	}

	@Transactional
	public void addressUpdate(Address address) {
		addressRepository.save(address);
	}

	@Transactional
	public void deleteAddress(Long aid) {
		addressRepository.deleteById(aid);
	}

}
