package com.ojas.wireframes.service;

import com.ojas.wireframes.entity.PlansEntity;

public interface PlansService {

	 int CreatePlan(PlansEntity plansEntity);
	
	 String updateUserAccount(PlansEntity plansentity);
	 
	 void removePlan(int id);
}
