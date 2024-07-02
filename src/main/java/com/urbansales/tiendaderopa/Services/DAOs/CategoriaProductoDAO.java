package com.urbansales.tiendaderopa.Services.DAOs;

import java.util.List;

import com.urbansales.tiendaderopa.Model.CategoriaProducto;

public interface CategoriaProductoDAO {
    public String newCategoriaProducto(CategoriaProducto categoriaProducto);
    public List<CategoriaProducto> getAllCategoriaProducto();
    public String deleteCategoriaProducto(int id);
    public CategoriaProducto getCategoriaProductoById(int id);
}
