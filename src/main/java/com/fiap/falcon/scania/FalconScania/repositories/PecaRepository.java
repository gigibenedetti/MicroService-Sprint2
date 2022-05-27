package com.fiap.falcon.scania.FalconScania.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiap.falcon.scania.FalconScania.model.Peca;

@Repository
public interface PecaRepository extends JpaRepository<Peca, Long>{

}
