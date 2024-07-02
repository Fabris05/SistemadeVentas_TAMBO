package com.urbansales.tiendaderopa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.urbansales.tiendaderopa.Model.VentaProducto;

@Repository
public interface VentaProductoRepository extends JpaRepository<VentaProducto,Integer>{
    
}
