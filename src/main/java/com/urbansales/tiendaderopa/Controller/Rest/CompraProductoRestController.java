package com.urbansales.tiendaderopa.Controller.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.urbansales.tiendaderopa.Model.CompraProducto;
import com.urbansales.tiendaderopa.Services.DAOs.CompraProductoDAO;
import com.urbansales.tiendaderopa.Services.DAOs.ProductoDAO;

@RestController
@RequestMapping("/compraProducto")
public class CompraProductoRestController {
    
    @Autowired
    private CompraProductoDAO compraProductoDAO;

    @Autowired
    private ProductoDAO productoDAO;

    @PostMapping("/save")
    public void registrarCompraProducto(@RequestBody List<CompraProducto> compraProductos){
        try{
            for(CompraProducto compraProducto : compraProductos){
                this.compraProductoDAO.newCompraProducto(compraProducto);
                this.productoDAO.updateStockProduct(compraProducto.getIdProducto(), 
                compraProducto.getCantidaCompradoProducto(), false);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
