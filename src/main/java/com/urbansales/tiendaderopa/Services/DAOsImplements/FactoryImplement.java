package com.urbansales.tiendaderopa.Services.DAOsImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbansales.tiendaderopa.Services.DAOs.CategoriaProductoDAO;
import com.urbansales.tiendaderopa.Services.DAOs.ClienteDAO;
import com.urbansales.tiendaderopa.Services.DAOs.CompraDAO;
import com.urbansales.tiendaderopa.Services.DAOs.CompraProductoDAO;
import com.urbansales.tiendaderopa.Services.DAOs.CompraProveedorDAO;
import com.urbansales.tiendaderopa.Services.DAOs.EmpleadoDAO;
import com.urbansales.tiendaderopa.Services.DAOs.FactoryDAO;
import com.urbansales.tiendaderopa.Services.DAOs.ProductoDAO;
import com.urbansales.tiendaderopa.Services.DAOs.ProveedorDAO;
import com.urbansales.tiendaderopa.Services.DAOs.PuestoTrabajoDAO;
import com.urbansales.tiendaderopa.Services.DAOs.VentaDAO;
import com.urbansales.tiendaderopa.Services.DAOs.VentaProductoDAO;

@Service
public class FactoryImplement implements FactoryDAO{

    @Autowired
    private EmpleadoDAO empleadoDAO;

    @Override
    public CategoriaProductoDAO getCategoriaProductoDAO() {
        return new CategoriaProductoImplement();
    }

    @Override
    public ClienteDAO getClienteDAO() {
        return new ClienteImplement();
    }

    @Override
    public CompraDAO getCompraDAO() {
        return new CompraImplement();
    }

    @Override
    public CompraProductoDAO getCompraProductoDAO() {
        return new CompraProductoImplement();
    }

    @Override
    public CompraProveedorDAO getCompraProveedorDAO() {
        return new CompraProveedorImplement();
    }

    @Override
    public EmpleadoDAO getEmpleadoDAO() {
        return this.empleadoDAO;
    }

    @Override
    public ProductoDAO getProductoDAO() {
        return new ProductoImplement();
    }

    @Override
    public ProveedorDAO getProveedorDAO() {
        return new ProveedorImplement();
    }

    @Override
    public PuestoTrabajoDAO getPuestoTrabajoDAO() {
        return new PuestoTrabajoImplement();
    }

    @Override
    public VentaDAO getVentaDAO() {
        return new VentaImplement();
    }

    @Override
    public VentaProductoDAO getVentaProductoDAO() {
        return new VentaProductoImplement();
    }
    
}
