package com.urbansales.tiendaderopa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.urbansales.tiendaderopa.Model.Proveedor;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor,Integer>{
    
}
