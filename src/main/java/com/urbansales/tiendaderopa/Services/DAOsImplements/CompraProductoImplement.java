package com.urbansales.tiendaderopa.Services.DAOsImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbansales.tiendaderopa.Model.CompraProducto;
import com.urbansales.tiendaderopa.Repository.CompraProductoRepository;
import com.urbansales.tiendaderopa.Services.DAOs.CompraProductoDAO;

@Service
public class CompraProductoImplement implements CompraProductoDAO{
    
    @Autowired
    private CompraProductoRepository compraProductoRepository;

    @Override
    public void newCompraProducto(CompraProducto compraProducto) {
        this.compraProductoRepository.save(compraProducto);
    }
}
