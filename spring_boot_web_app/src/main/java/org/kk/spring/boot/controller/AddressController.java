package org.kk.spring.boot.controller;

import java.util.List;

import org.kk.spring.boot.model.Address;
import org.kk.spring.boot.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping ("/address")
public class AddressController {

	@Autowired
	private AddressService addressService;
	
	@RequestMapping ("/register")
	public String registerAddress(ModelMap map) {
		map.addAttribute("address", new Address());
		map.addAttribute("Mode", "EDIT");
		return "address_register";
	}
	
	@RequestMapping (value = "/save", method = RequestMethod.POST)
	public String saveAddress(@ModelAttribute Address address, ModelMap map) {
		//call the service method
		Long id = addressService.saveAddress(address);
		map.addAttribute("message", "Address ID '" + id + " ' Created");
		map.addAttribute("address", new Address());
		return "address_register";
	}
	
	@GetMapping ("/showAll")
	public String showAllAddress(ModelMap map) {
		List<Address> listAddress = addressService.getAllAddress();
		map.addAttribute("lists", listAddress);
		return "address_data";
	}
	
	@RequestMapping ("/getOne/{aid}")
	public String getOneAddress(@PathVariable Long aid, ModelMap map) throws Exception{
		Address address = addressService.getById(aid);
		map.addAttribute("getOneAddress", address);
		return "address_view";
	}
	
	@RequestMapping (value = "/edit")
	public String editAddressById(@RequestParam Long aid, ModelMap map) {
		addressService.getById(aid);
		Address address =addressService.getById(aid);
		//From BACKING OBJECT
		map.addAttribute("address", address);
		map.addAttribute("Mode", "REGISTER");
		return "address_edit";
	}
	
	@RequestMapping ("/update")
	public String updateAddress(@ModelAttribute Address address) {
		addressService.addressUpdate(address);
		return "redirect:showAll";
	}
	
	@RequestMapping("/delete")
	public String deleteAddress(@RequestParam Long aid) {
		addressService.deleteAddress(aid);
		return "redirect:showAll";
	}
	
}
