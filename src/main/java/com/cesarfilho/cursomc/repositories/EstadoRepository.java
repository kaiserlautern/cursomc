package com.cesarfilho.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cesarfilho.cursomc.dominio.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}
