package com.arn.mc2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arn.mc2.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

	

}
