package com.urbansales.tiendaderopa.Controller.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.urbansales.tiendaderopa.Model.Producto;
import com.urbansales.tiendaderopa.Services.DAOs.ProductoDAO;

@RestController
@RequestMapping("/producto")
public class ProductoRestController {
    
    @Autowired
    private ProductoDAO productoDAO;

    @GetMapping("/list")
    public List<Producto> listaProductos(){
        try{
            return this.productoDAO.getAllProducto();
        }catch(Exception ex){
            return null;
        }
    }

    @PostMapping("/save")
    public String agregarProducto(@RequestBody Producto producto){
        try{
            return this.productoDAO.newProducto(producto);
        }catch(Exception ex){
            return "Error: " + ex.getMessage();
        }
    }

    @DeleteMapping("/remove/{id}")
    public String eliminarProducto(@PathVariable int id){
        try{
            return this.productoDAO.deleteProducto(id);
        }catch(Exception ex){
            return "Error: " +ex.getMessage();
        }
    }
}
