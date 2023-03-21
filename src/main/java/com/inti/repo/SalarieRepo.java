package com.inti.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.model.Salarie;

@Repository
public interface SalarieRepo extends JpaRepository<Salarie, Integer>{

}
