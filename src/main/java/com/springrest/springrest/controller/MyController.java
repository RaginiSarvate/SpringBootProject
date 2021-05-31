package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Load;
import com.springrest.springrest.services.LoadService;


@RestController
public class MyController {
	
	@Autowired
	private LoadService loadService;

	
	//to get all the loads record
	@GetMapping("/load")
	public List<Load> getLoads(){
    return this.loadService.getLoads();
}
	
	//to get particular load record 
	@GetMapping("/load/{loadId}")
	public Load getLoad(@PathVariable String loadId) {
		return this.loadService.getLoad(Long.parseLong(loadId));
	}
	
	//to add load
	@PostMapping("/load")
	public Load addLoad(@RequestBody Load load) {
		
		System.out.println("loads details added successfully");
		return this.loadService.addLoad(load);
		
		
	}
	
	//to update load
	@PutMapping("/load/{loadId}")
	public Load updateLoad(@RequestBody Load load,@PathVariable String loadId) {
		return this.loadService.updateLoad(load,Long.parseLong(loadId));
	}
	
	//to delete load
	@DeleteMapping("/load/{loadId}")
	public ResponseEntity<HttpStatus> deleteLoad(@PathVariable String loadId){
		try {
			this.loadService.deleteLoad(Long.parseLong(loadId));
			return new ResponseEntity<>(HttpStatus.OK);
			
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
