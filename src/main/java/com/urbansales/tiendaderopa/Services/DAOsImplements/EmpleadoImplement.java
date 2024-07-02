package com.urbansales.tiendaderopa.Services.DAOsImplements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbansales.tiendaderopa.Model.Empleado;
import com.urbansales.tiendaderopa.Repository.EmpleadoRepository;
import com.urbansales.tiendaderopa.Services.DAOs.EmpleadoDAO;

@Service
public class EmpleadoImplement implements EmpleadoDAO{
    
    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public String newEmpleado(Empleado empleado) {
        this.empleadoRepository.save(empleado);

        return "Empleado Agregado Exitosamente";
    }

    @Override
    public List<Empleado> getAllEmpleado() {
        return this.empleadoRepository.findAll();
    }

    @Override
    public String deleteEmpleado(int id) {
        this.empleadoRepository.deleteById(id);

        return "Empleado Eliminado Exitosamente";
    }
}
