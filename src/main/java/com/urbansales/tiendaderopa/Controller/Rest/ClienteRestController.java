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

import com.urbansales.tiendaderopa.Model.Cliente;
import com.urbansales.tiendaderopa.Services.DAOs.ClienteDAO;

@RestController
@RequestMapping("/cliente")
public class ClienteRestController {
    
    @Autowired
    private ClienteDAO clienteDAO;

    @PostMapping("/save")
    public String agregarCliente(@RequestBody Cliente cliente){
        try{
            return this.clienteDAO.newCliente(cliente);
        }catch(Exception ex){
            return "Error: " + ex.getMessage();
        }
    }

    @GetMapping("/list")
    public List<Cliente> listaClientes(){
        try{
            return this.clienteDAO.getAllCliente();
        }catch(Exception ex){
            return null;
        }
    }

    @DeleteMapping("/remove/{id}")
    public String eliminarCliente(@PathVariable int id){
        try{
            return this.clienteDAO.deleteCliente(id);
        }catch(Exception ex){
            return "Error: " + ex.getMessage();
        }
    }
}
