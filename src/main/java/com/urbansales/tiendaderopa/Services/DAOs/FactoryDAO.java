package com.urbansales.tiendaderopa.Services.DAOs;

public interface FactoryDAO {
    public CategoriaProductoDAO getCategoriaProductoDAO();
    public ClienteDAO getClienteDAO();
    public CompraDAO getCompraDAO();
    public CompraProductoDAO getCompraProductoDAO();
    public CompraProveedorDAO getCompraProveedorDAO();
    public EmpleadoDAO getEmpleadoDAO();
    public ProductoDAO getProductoDAO();
    public ProveedorDAO getProveedorDAO();
    public PuestoTrabajoDAO getPuestoTrabajoDAO();
    public VentaDAO getVentaDAO();
    public VentaProductoDAO getVentaProductoDAO();
}
