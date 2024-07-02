package com.urbansales.tiendaderopa.Controller.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.urbansales.tiendaderopa.Model.Compra;
import com.urbansales.tiendaderopa.Services.DAOs.CompraDAO;

@RestController
@RequestMapping("/compra")
public class CompraRestController {
    
    @Autowired
    private CompraDAO compraDAO;

    @PostMapping("/save")
    public String registrarCompra(@RequestBody Compra compra){
        try{
            return this.compraDAO.newCompra(compra);
        }catch(Exception ex){
            return "Error: " +ex.getMessage();
        }
    }
}
