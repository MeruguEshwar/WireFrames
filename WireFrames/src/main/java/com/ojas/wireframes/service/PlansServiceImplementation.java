package com.ojas.wireframes.service;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.wireframes.entity.PlansEntity;
import com.ojas.wireframes.entity.PlansHistoryEntity;
import com.ojas.wireframes.repository.PlansHistoryRepository;
import com.ojas.wireframes.repository.PlansRepository;

@Service
public class PlansServiceImplementation implements PlansService {

	@Autowired
	private PlansRepository plansrepository;

	@Autowired
	private PlansHistoryRepository planshistoryRepository;

	@Override
	public int CreatePlan(PlansEntity plansEntity) {

		int count = 0;

		PlansEntity pln = plansrepository.save(plansEntity);

		PlansHistoryEntity planhistory = new PlansHistoryEntity();
		planhistory.setId(pln.getId());
		planhistory.setPalneName(pln.getPalneName());
		planhistory.setDescrption(pln.getDescrption());
		planhistory.setPrice(pln.getPrice());
		planhistory.setPublishedDate(LocalDateTime.now());
		planshistoryRepository.save(planhistory);

		if (pln != null) {
			count = 1;
		}

		return count;
	}

	@Override
	public String updateUserAccount(PlansEntity plansentity) {

		PlansEntity pln = plansrepository.saveAndFlush(plansentity);

		PlansHistoryEntity planhistory = new PlansHistoryEntity();
		planhistory.setId(pln.getId());
		planhistory.setPalneName(pln.getPalneName());
		planhistory.setDescrption(pln.getDescrption());
		planhistory.setPrice(pln.getPrice());
		planhistory.setPublishedDate(LocalDateTime.now());
		planshistoryRepository.save(planhistory);
		String msg = "";
		if (pln != null) {
			msg = "updated";
		}
		return msg;

	}

	@Override
	public void removePlan(int id) {
		plansrepository.deleteById(id);
	}

}
