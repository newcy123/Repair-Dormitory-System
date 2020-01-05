package com.cpe.dormsys.repository;

import com.cpe.dormsys.entity.DeviceProblem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DeviceProblemRepository extends JpaRepository<DeviceProblem, Long> {
    DeviceProblem findById(long id);
    //List<DeviceProblem> findByDeviceType(DeviceType DeviceType);
}