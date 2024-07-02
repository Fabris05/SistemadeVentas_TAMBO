package com.urbansales.tiendaderopa.Services.DAOsImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbansales.tiendaderopa.Model.VentaProducto;
import com.urbansales.tiendaderopa.Repository.VentaProductoRepository;
import com.urbansales.tiendaderopa.Services.DAOs.VentaProductoDAO;

@Service
public class VentaProductoImplement implements VentaProductoDAO{
    
    @Autowired
    private VentaProductoRepository ventaProductoRepository;

    @Override
    public void newVentaProducto(VentaProducto ventaProducto) {
        this.ventaProductoRepository.save(ventaProducto);
    }
}
