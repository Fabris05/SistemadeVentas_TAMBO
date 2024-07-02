package com.urbansales.tiendaderopa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.urbansales.tiendaderopa.Model.CompraProducto;

@Repository
public interface CompraProductoRepository extends JpaRepository<CompraProducto,Integer>{
    
}
