package com.cpe.dormsys.repository;

import com.cpe.dormsys.entity.DeviceType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DeviceTypeRepository extends JpaRepository<DeviceType, Long> {
    DeviceType findById(long id);
}