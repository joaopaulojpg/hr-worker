package com.ibm.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
