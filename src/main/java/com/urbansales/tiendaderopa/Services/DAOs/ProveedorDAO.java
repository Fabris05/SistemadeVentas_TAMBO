package com.urbansales.tiendaderopa.Services.DAOs;

import java.util.List;

import com.urbansales.tiendaderopa.Model.Proveedor;

public interface ProveedorDAO {
    public String newProveedor(Proveedor proveedor);
    public List<Proveedor> getAllProveedor();
    public String deleteProveedor(int id);
}
