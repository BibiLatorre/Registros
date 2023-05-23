package com.example.Registros.servicio;

import com.example.Registros.entidad.Persona;

import java.util.List;

public interface PersonaServicio {
    public List<Persona> ListarTodasLasPersonas();
    public Persona GuardarPersona (Persona persona);
    public Persona ObtenerPorId (Integer id);
    public Persona ActualizarPersona (Persona persona);
    public void EliminarPersona (Integer id);
}
