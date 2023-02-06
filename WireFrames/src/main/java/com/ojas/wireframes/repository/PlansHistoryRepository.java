package com.ojas.wireframes.repository;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.wireframes.entity.PlansHistoryEntity;

public interface PlansHistoryRepository extends JpaRepository<PlansHistoryEntity, LocalDateTime> {

}
