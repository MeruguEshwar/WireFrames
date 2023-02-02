package com.ojas.wireframes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.wireframes.entity.PlansEntity;
import com.ojas.wireframes.repository.PlansRepository;

@RestController()
@RequestMapping("/plans")
public class PlansController {
	
	@Autowired
	private PlansRepository plansrepository;
	
	@PostMapping("/createplan")
	public PlansEntity createPlans(@RequestBody PlansEntity plansEntity) {
		return plansrepository.save(plansEntity);
	}
	
	@GetMapping("/allPlans")
	public List<PlansEntity> getAllPlans(){
		return plansrepository.findAll();
	}
	
	
	@GetMapping("/PlanById/{id}")
	public Optional<PlansEntity> getPlanById(@PathVariable("id") int id){
		return plansrepository.findById(id);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public void DeletePlan(@PathVariable("id") int id) {
		 plansrepository.deleteById(id);
	}
	
	@PutMapping("/update")
	public PlansEntity updateProduct(@RequestBody PlansEntity plansEntity) {
		return plansrepository.save(plansEntity);
	}
}
