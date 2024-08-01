package com.system.day.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.day.entity.DiaAtividade;
import com.system.day.entity.DiaAtividadeKey;

@Repository
public interface DiaAtividadeRepository extends JpaRepository<DiaAtividade, DiaAtividadeKey>{

}
