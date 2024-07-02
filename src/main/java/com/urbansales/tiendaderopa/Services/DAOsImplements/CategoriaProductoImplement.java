package com.urbansales.tiendaderopa.Services.DAOsImplements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbansales.tiendaderopa.Model.CategoriaProducto;
import com.urbansales.tiendaderopa.Repository.CategoriaProductoRepository;
import com.urbansales.tiendaderopa.Services.DAOs.CategoriaProductoDAO;

@Service
public class CategoriaProductoImplement implements CategoriaProductoDAO{

    @Autowired
    private CategoriaProductoRepository categoriaProductoRepository;

    @Override
    public String newCategoriaProducto(CategoriaProducto categoriaProducto) {
        this.categoriaProductoRepository.save(categoriaProducto);

        return "Categoria de Producto Agregado Exitosamente";
    }

    @Override
    public List<CategoriaProducto> getAllCategoriaProducto() {
        return this.categoriaProductoRepository.findAll();
    }

    @Override
    public String deleteCategoriaProducto(int id) {
        this.categoriaProductoRepository.deleteById(id);
        
        return "Categoria de Producto Eliminado Exitosamente";
    }

    @Override
    public CategoriaProducto getCategoriaProductoById(int id) {
        return this.categoriaProductoRepository.findById(id).orElse(null);
    }
    
}
