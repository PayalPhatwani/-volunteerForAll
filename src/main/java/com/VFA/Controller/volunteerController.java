package com.VFA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.VFA.Model.volunteerBean;
import com.VFA.Repository.volunteer_Repository;

@RestController
@RequestMapping("/volunteer")
@CrossOrigin(origins="*")
public class volunteerController {
	
	@Autowired
	volunteer_Repository repo;
	
	//Get all volunteers details
	@GetMapping("/getAll")
	public List<volunteerBean> listOfAllVolunteer(){
		return repo.findAll();
	}
	
	//get details of specific volunteer by volunteer id
	@GetMapping("/getOne/{id}")
	public volunteerBean aVolunteerDetail(@PathVariable Long id) {
		return repo.findById(id).orElseThrow(()->new NoSuchFieldError());
	}
	
	//Register a volunter
	@PostMapping("/add")
	public volunteerBean addVolunteer(@RequestBody volunteerBean beanObj) {
		return repo.save(beanObj);
	}
	
	//update  volunteer detail
	@PutMapping("/update/{id}")
	public volunteerBean updateVolunteer(@PathVariable Long id,@RequestBody volunteerBean updatedVolunteerObj) {
		return repo.save(updatedVolunteerObj);
	}
	
	//delete volunteer
	@DeleteMapping("/delete/{id}")
	public void deleteVolunteer(@PathVariable Long id) {
		 repo.deleteById(id);
	}
	

}
