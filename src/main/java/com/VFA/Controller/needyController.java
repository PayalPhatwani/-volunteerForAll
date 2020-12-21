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

import com.VFA.Model.needyBean;
import com.VFA.Repository.needy_Repository;

@RestController
@RequestMapping("/needy")
@CrossOrigin(origins="*")
public class needyController {
	
	@Autowired
	needy_Repository repo;
	
	
	//Get all Needys details
	@GetMapping("/getAll")
	public List<needyBean> listOfAllNeedy(){
		return repo.findAll();
	}
	
	//get details of specific Needy by Needy id
	@GetMapping("/getOne/{id}")
	public needyBean aNeedyDetail(@PathVariable Long id) {
		return repo.findById(id).orElseThrow(()->new NoSuchFieldError());
	}
	
	//Register a volunter
	@PostMapping("/add")
	public needyBean addNeedy(@RequestBody needyBean beanObj) {
		return repo.save(beanObj);
	}
	
	//update  Needy detail
	@PutMapping("/update/{id}")
	public needyBean updateNeedy(@PathVariable Long id,@RequestBody needyBean updatedNeedyObj) {
		return repo.save(updatedNeedyObj);
	}
	
	//delete Needy
	@DeleteMapping("/delete/{id}")
	public void deleteNeedy(@PathVariable Long id) {
		 repo.deleteById(id);
	}
	

}
