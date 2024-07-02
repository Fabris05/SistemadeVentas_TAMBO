package com.urbansales.tiendaderopa.Services.DAOs;

import java.util.List;

import com.urbansales.tiendaderopa.Model.PuestoTrabajo;

public interface PuestoTrabajoDAO {
    public String newPuestoTrabajo(PuestoTrabajo puestoTrabajo);
    public List<PuestoTrabajo> getAllPuestoTrabajo();
    public String deletePuestoTrabajo(int id);
}
