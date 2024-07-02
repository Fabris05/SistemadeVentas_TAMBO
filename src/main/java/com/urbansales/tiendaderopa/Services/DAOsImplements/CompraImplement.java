package com.urbansales.tiendaderopa.Services.DAOsImplements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbansales.tiendaderopa.Model.Compra;
import com.urbansales.tiendaderopa.Repository.CompraRepository;
import com.urbansales.tiendaderopa.Services.DAOs.CompraDAO;

@Service
public class CompraImplement implements CompraDAO{
    
    @Autowired
    private CompraRepository compraRepository;

    @Override
    public String newCompra(Compra compra) {
        this.compraRepository.save(compra);

        return "Compra Agregada Exitosamente";
    }

    @Override
    public List<Compra> getAllCompra() {
        return this.compraRepository.findAll();
    }

    @Override
    public String deleteCompra(int id) {
        this.compraRepository.deleteById(id);

        return "Compra Eliminada Exitosamente";
    }

    
}
