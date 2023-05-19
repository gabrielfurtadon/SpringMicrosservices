package br.com.Gabriel.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Gabriel.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
