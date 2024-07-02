package com.urbansales.tiendaderopa.Services.DAOs;

import java.util.List;

import com.urbansales.tiendaderopa.Model.Empleado;

public interface EmpleadoDAO {
    public String newEmpleado(Empleado empleado);
    public List<Empleado> getAllEmpleado();
    public String deleteEmpleado(int id);
}
