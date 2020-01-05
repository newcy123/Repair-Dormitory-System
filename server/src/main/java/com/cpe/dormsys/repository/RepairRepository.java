package com.cpe.dormsys.repository;

import com.cpe.dormsys.entity.Repair;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RepairRepository extends JpaRepository<Repair, Long> {
    
}