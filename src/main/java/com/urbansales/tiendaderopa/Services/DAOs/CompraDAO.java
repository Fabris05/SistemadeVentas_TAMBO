package com.urbansales.tiendaderopa.Services.DAOs;

import java.util.List;

import com.urbansales.tiendaderopa.Model.Compra;

public interface CompraDAO {
    public String newCompra(Compra compra);
    public List<Compra> getAllCompra();
    public String deleteCompra(int id);
}
