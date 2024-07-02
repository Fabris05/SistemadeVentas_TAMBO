package com.urbansales.tiendaderopa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.urbansales.tiendaderopa.Model.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado,Integer>{
    
}
