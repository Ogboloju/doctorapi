package com.og.docapptrestapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApptRestController {
	
	@Autowired
	ApptRepository repository;
	
	@RequestMapping(value="/appts/", method= RequestMethod.GET)
	public List<Appt> getAppts() {
		return repository.findAll();
		
	}
	
	@RequestMapping(value="/appts/{id}", method= RequestMethod.GET)
	public Appt getAppt(@PathVariable("id")int id) {
		return repository.findById(id).get();
	}

	@RequestMapping(value="/appts/", method= RequestMethod.POST)
	public Appt createAppt(Appt appt) {
		return repository.save(appt);
	}
	
	@RequestMapping(value="/appts/", method= RequestMethod.PUT)
	public Appt updateAppt(Appt appt) {
		return repository.save(appt);
	
}

	@RequestMapping(value="/appts/{id}", method= RequestMethod.DELETE)
	public void deleteAppt(@PathVariable("id")int id) {
		 repository.deleteById(id);
	
}
}