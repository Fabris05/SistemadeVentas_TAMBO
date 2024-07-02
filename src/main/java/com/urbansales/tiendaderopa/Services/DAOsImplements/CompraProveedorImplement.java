package com.urbansales.tiendaderopa.Services.DAOsImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbansales.tiendaderopa.Model.CompraProveedor;
import com.urbansales.tiendaderopa.Repository.CompraProveedorRepository;
import com.urbansales.tiendaderopa.Services.DAOs.CompraProveedorDAO;

@Service
public class CompraProveedorImplement implements CompraProveedorDAO{
    
    @Autowired
    private CompraProveedorRepository compraProveedorRepository;

    @Override
    public void newCompraProveedor(CompraProveedor compraProveedor) {
        this.compraProveedorRepository.save(compraProveedor);
    }
}
