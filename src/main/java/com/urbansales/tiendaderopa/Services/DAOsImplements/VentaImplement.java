package com.urbansales.tiendaderopa.Services.DAOsImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbansales.tiendaderopa.Model.Venta;
import com.urbansales.tiendaderopa.Repository.VentaRepository;
import com.urbansales.tiendaderopa.Services.DAOs.VentaDAO;

@Service
public class VentaImplement implements VentaDAO{
    
    @Autowired
    private VentaRepository ventaRepository;

    @Override
    public String newVenta(Venta venta) {
        this.ventaRepository.save(venta);

        return "Venta Agregado Exitosamente";
    }
}
