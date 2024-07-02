package com.urbansales.tiendaderopa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.urbansales.tiendaderopa.Model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer>{
    
}
