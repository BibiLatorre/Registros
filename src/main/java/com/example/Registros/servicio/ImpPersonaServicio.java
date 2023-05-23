package com.example.Registros.servicio;

import com.example.Registros.entidad.Persona;
import com.example.Registros.repositorio.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpPersonaServicio implements PersonaServicio{
    @Autowired
    private PersonaRepositorio personaRepositorio;

    @Override
    public List<Persona> ListarTodasLasPersonas() {
        return personaRepositorio.findAll();
    }

    @Override
    public Persona GuardarPersona(Persona persona) {
        return null;
    }

    @Override
    public Persona ObtenerPorId(Integer id) {
        return null;
    }

    @Override
    public Persona ActualizarPersona(Persona persona) {
        return null;
    }

    @Override
    public void EliminarPersona(Integer id) {

    }
}
