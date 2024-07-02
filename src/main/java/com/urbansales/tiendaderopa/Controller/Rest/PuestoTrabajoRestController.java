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

import com.urbansales.tiendaderopa.Model.PuestoTrabajo;
import com.urbansales.tiendaderopa.Services.DAOs.PuestoTrabajoDAO;

@RestController
@RequestMapping("/puestoTrabajo")
public class PuestoTrabajoRestController {
    
    @Autowired
    private PuestoTrabajoDAO puestoTrabajoDAO;

    @GetMapping("/list")
    public List<PuestoTrabajo> listaPuestoTrabajos(){
        try{
            return this.puestoTrabajoDAO.getAllPuestoTrabajo();
        }catch(Exception ex){
            return null;
        }
    }

    @PostMapping("/save")
    public String agregarPuestoTrabajo(@RequestBody PuestoTrabajo puestoTrabajo){
        try{
            return this.puestoTrabajoDAO.newPuestoTrabajo(puestoTrabajo);
        }catch(Exception ex){
            return "Error: " + ex.getMessage();
        }
    }

    @DeleteMapping("/remove/{id}")
    public String eliminarPuestoTrabajo(@PathVariable int id){
        try{
            return this.puestoTrabajoDAO.deletePuestoTrabajo(id);
        }catch(Exception ex){
            return "Error: " + ex.getMessage();
        }
    }
}
