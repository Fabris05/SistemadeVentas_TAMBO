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

import com.urbansales.tiendaderopa.Model.CategoriaProducto;
import com.urbansales.tiendaderopa.Services.DAOs.CategoriaProductoDAO;

@RestController
@RequestMapping("/categoriaProducto")
public class CategoriaProductoRestController {
    
    @Autowired
    private CategoriaProductoDAO categoriaProductoDAO;

    @GetMapping("/list")
    public List<CategoriaProducto> listaCategoriaProductos(){
        try{
            return this.categoriaProductoDAO.getAllCategoriaProducto();
        }catch(Exception ex){
            return null;
        }
    }

    @PostMapping("/save")
    public String agregarCategoriaProducto(@RequestBody CategoriaProducto categoriaProducto){
        try{
            return this.categoriaProductoDAO.newCategoriaProducto(categoriaProducto);
        }catch(Exception ex){
            return "Error: " + ex.getMessage();
        }
    }

    @DeleteMapping("/remove/{id}")
    public String eliminarCategoriaProducto(@PathVariable int id){
        try{
            return this.categoriaProductoDAO.deleteCategoriaProducto(id);
        }catch(Exception ex){
            return "Error: " + ex.getMessage();
        }
    }
}
