package com.urbansales.tiendaderopa.Services.DAOsImplements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbansales.tiendaderopa.Model.Producto;
import com.urbansales.tiendaderopa.Repository.ProductoRepository;
import com.urbansales.tiendaderopa.Services.DAOs.ProductoDAO;

@Service
public class ProductoImplement implements ProductoDAO{
    
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public String newProducto(Producto producto) {
        this.productoRepository.save(producto);

        return "Producto Agregado Exitosamente";
    }

    @Override
    public List<Producto> getAllProducto() {
        return this.productoRepository.findAll();
    }

    @Override
    public String deleteProducto(int id) {
        this.productoRepository.deleteById(id);

        return "Producto Eliminado Exitosamente";
    }

    // true:salida or false:entrada
    @Override
    public void updateStockProduct(int id, int purchasedQuantity, boolean operator) {
        Producto producto = this.productoRepository.findById(id).orElse(null);

        int stockActual = producto.getCantidad();
        int nuevoStock = 0;

        if(operator){
            nuevoStock = stockActual - purchasedQuantity;
        }else{
            nuevoStock = stockActual + purchasedQuantity;
        }

        producto.setCantidad(nuevoStock);

        this.productoRepository.save(producto);
    }
}
