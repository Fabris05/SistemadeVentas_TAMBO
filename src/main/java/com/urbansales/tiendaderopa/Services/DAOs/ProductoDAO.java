package com.urbansales.tiendaderopa.Services.DAOs;

import java.util.List;

import com.urbansales.tiendaderopa.Model.Producto;

public interface ProductoDAO {
    public String newProducto(Producto producto);
    public List<Producto> getAllProducto();
    public String deleteProducto(int id);
    public void updateStockProduct(int id,int purchasedQuantity,boolean operator);
}
