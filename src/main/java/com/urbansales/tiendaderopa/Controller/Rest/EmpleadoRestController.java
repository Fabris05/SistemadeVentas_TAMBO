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

import com.urbansales.tiendaderopa.Model.Empleado;
import com.urbansales.tiendaderopa.Services.DAOs.EmpleadoDAO;

@RestController
@RequestMapping("/empleado")
public class EmpleadoRestController {
    
    @Autowired
    private EmpleadoDAO empleadoDAO;

    @GetMapping("/list")
    public List<Empleado> listaEmpleados(){
        try{
            return this.empleadoDAO.getAllEmpleado();
        }catch(Exception ex){
            return null;
        }
    }

    @PostMapping("/save")
    public String agregarEmpleado(@RequestBody Empleado empleado){
        try{
            return this.empleadoDAO.newEmpleado(empleado);
        }catch(Exception ex){
            return "Error: " + ex.getMessage();
        }
    }

    @DeleteMapping("/remove/{id}")
    public String eliminarEmpleado(@PathVariable int id){
        try{
            return this.empleadoDAO.deleteEmpleado(id);
        }catch(Exception ex){
            return "Error: " + ex.getMessage();
        }
    }
}
