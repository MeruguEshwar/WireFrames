package com.ojas.wireframes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.wireframes.entity.PlansEntity;

@Repository
public interface PlansRepository extends JpaRepository<PlansEntity, Integer> {

}
