package com.urbansales.tiendaderopa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.urbansales.tiendaderopa.Model.CompraProveedor;

@Repository
public interface CompraProveedorRepository extends JpaRepository<CompraProveedor,Integer>{
    
}
