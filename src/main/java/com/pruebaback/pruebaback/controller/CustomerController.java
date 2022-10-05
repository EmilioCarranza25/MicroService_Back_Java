package com.pruebaback.pruebaback.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaback.pruebaback.entities.Customer;
import com.pruebaback.pruebaback.errorhandler.BadRequestException;
import com.pruebaback.pruebaback.repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping()
	@ResponseStatus(HttpStatus.OK)
	public List<Customer> list(){
		try {
			return customerRepository.findAll();
		} catch (Exception e) {
			throw new BadRequestException("Error al Cargar Valores " + e);
			
		}
		
				
	}
	

	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<?> post(@RequestBody Customer input){
		Customer save = customerRepository.save(input);
		return ResponseEntity.ok(save);
	}
	
	
	/**public List<Customer> customer(){
		
		List<Customer> customer = new ArrayList<Customer>();
		
		customer.get(0).setFirstName("Enrrique");
		customer.get(0).setSecondName("Alberto");
		customer.get(0).setLastName("Garcia");
		customer.get(0).setLastaName2("Marquez");
		customer.get(0).setCity("Bogota");
		customer.get(0).setAddress("Diag. 84 # 76 -30");
		customer.get(0).setPhone("12345662123");
		
		return customer;
		
	}*/

}
