package com.urbansales.tiendaderopa.Services.DAOs;

import java.util.List;

import com.urbansales.tiendaderopa.Model.Cliente;

public interface ClienteDAO {
    public String newCliente(Cliente cliente);
    public List<Cliente> getAllCliente();
    public String deleteCliente(int id);
}
