package com.urbansales.tiendaderopa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.urbansales.tiendaderopa.Model.PuestoTrabajo;

@Repository
public interface PuestoTrabajoRepository extends JpaRepository<PuestoTrabajo,Integer>{
    
}
