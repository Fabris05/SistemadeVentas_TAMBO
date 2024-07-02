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

import com.urbansales.tiendaderopa.Model.Proveedor;
import com.urbansales.tiendaderopa.Services.DAOs.ProveedorDAO;

@RestController
@RequestMapping("/proveedor")
public class ProveedorRestController {
    
    @Autowired
    private ProveedorDAO proveedorDAO;

    @PostMapping("/save")
    public String agregarProveedor(@RequestBody Proveedor proveedor){
        try{
            return this.proveedorDAO.newProveedor(proveedor);
        }catch(Exception ex){
            return "Error: " + ex.getMessage();
        }
    }

    @GetMapping("/list")
    public List<Proveedor> listaProveedores(){
        try{
            return this.proveedorDAO.getAllProveedor();
        }catch(Exception ex){
            return null;
        }
    }

    @DeleteMapping("/remove/{id}")
    public String eliminarProveedor(@PathVariable int id){
        try{
            return this.proveedorDAO.deleteProveedor(id);
        }catch(Exception ex){
            return "Error: " + ex.getMessage();
        }
    }
}
