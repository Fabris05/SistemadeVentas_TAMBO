package com.urbansales.tiendaderopa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.urbansales.tiendaderopa.Model.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta,Integer>{
    
}
