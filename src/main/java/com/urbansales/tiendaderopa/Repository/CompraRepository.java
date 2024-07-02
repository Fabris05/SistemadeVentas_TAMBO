package com.urbansales.tiendaderopa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.urbansales.tiendaderopa.Model.Compra;

@Repository
public interface CompraRepository extends JpaRepository<Compra,Integer>{
    
}
