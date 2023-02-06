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
import com.ojas.wireframes.entity.PlansHistoryEntity;
import com.ojas.wireframes.repository.PlansRepository;
import com.ojas.wireframes.service.PlansServiceImplementation;

@RestController()
@RequestMapping("/plans")
public class PlansController {
	
	@Autowired
	private PlansRepository plansrepository;
	
	@Autowired
	private PlansServiceImplementation planserviceImpl;
	
	@PostMapping("/createplan")
	public int createPlans(@RequestBody PlansEntity plansEntity) {
		return planserviceImpl.CreatePlan(plansEntity);
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
		planserviceImpl.removePlan(id);
	}

	@PutMapping("/update")
	public void updatePlan(@RequestBody PlansEntity plansEntity) {
		planserviceImpl.updateUserAccount(plansEntity);
	}
}
