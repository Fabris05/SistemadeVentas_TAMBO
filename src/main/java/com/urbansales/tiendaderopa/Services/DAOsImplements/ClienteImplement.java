package com.urbansales.tiendaderopa.Services.DAOsImplements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbansales.tiendaderopa.Model.Cliente;
import com.urbansales.tiendaderopa.Repository.ClienteRepository;
import com.urbansales.tiendaderopa.Services.DAOs.ClienteDAO;

@Service
public class ClienteImplement implements ClienteDAO{
    
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public String newCliente(Cliente cliente) {
        this.clienteRepository.save(cliente);

        return "Cliente Agregado Exitosamente";
    }

    @Override
    public List<Cliente> getAllCliente() {
        return this.clienteRepository.findAll();
    }

    @Override
    public String deleteCliente(int id) {
        this.clienteRepository.deleteById(id);

        return "Cliente Eliminado Exitosamente";
    }
}
