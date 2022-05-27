package com.fiap.falcon.scania.FalconScania.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiap.falcon.scania.FalconScania.model.NotificacaoFurto;

@Repository
public interface NotificacaoFurtoRepository extends JpaRepository<NotificacaoFurto, Long>{

}
