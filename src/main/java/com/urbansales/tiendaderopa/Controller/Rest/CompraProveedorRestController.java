package com.urbansales.tiendaderopa.Controller.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.urbansales.tiendaderopa.Model.CompraProveedor;
import com.urbansales.tiendaderopa.Services.DAOs.CompraProveedorDAO;

@RestController
@RequestMapping("/compraProveedor")
public class CompraProveedorRestController {
    
    @Autowired
    private CompraProveedorDAO compraProveedorDAO;

    @PostMapping("/save")
    public void registrarCompraProveedor(@RequestBody List<CompraProveedor> compraProveedores){
        try{
            for(CompraProveedor compraProveedor : compraProveedores){
                this.compraProveedorDAO.newCompraProveedor(compraProveedor);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
