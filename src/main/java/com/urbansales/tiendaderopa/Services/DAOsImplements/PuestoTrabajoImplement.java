package com.urbansales.tiendaderopa.Services.DAOsImplements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbansales.tiendaderopa.Model.PuestoTrabajo;
import com.urbansales.tiendaderopa.Repository.PuestoTrabajoRepository;
import com.urbansales.tiendaderopa.Services.DAOs.PuestoTrabajoDAO;

@Service
public class PuestoTrabajoImplement implements PuestoTrabajoDAO{
    
    @Autowired
    private PuestoTrabajoRepository puestoTrabajoRepository;

    @Override
    public String newPuestoTrabajo(PuestoTrabajo puestoTrabajo) {
        this.puestoTrabajoRepository.save(puestoTrabajo);

        return "Puesto Trabajo Agregado Exitosamente";
    }

    @Override
    public List<PuestoTrabajo> getAllPuestoTrabajo() {
        return this.puestoTrabajoRepository.findAll();
    }

    @Override
    public String deletePuestoTrabajo(int id) {
        this.puestoTrabajoRepository.deleteById(id);

        return "Puesto Trabajo Eliminado Exitosamente";
    }
}
