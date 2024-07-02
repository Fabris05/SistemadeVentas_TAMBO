package com.urbansales.tiendaderopa.Services.DAOsImplements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbansales.tiendaderopa.Model.Proveedor;
import com.urbansales.tiendaderopa.Repository.ProveedorRepository;
import com.urbansales.tiendaderopa.Services.DAOs.ProveedorDAO;

@Service
public class ProveedorImplement implements ProveedorDAO{
    
    @Autowired
    private ProveedorRepository proveedorRepository;

    @Override
    public String newProveedor(Proveedor proveedor) {
        this.proveedorRepository.save(proveedor);

        return "Proveedor Agregado Exitosamente";
    }

    @Override
    public List<Proveedor> getAllProveedor() {
        return this.proveedorRepository.findAll();
    }

    @Override
    public String deleteProveedor(int id) {
        this.proveedorRepository.deleteById(id);

        return "Proveedor Eliminado Exitosamente";
    }
}
