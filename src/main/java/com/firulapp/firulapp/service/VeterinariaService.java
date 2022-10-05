package com.firulapp.firulapp.service;

import com.firulapp.firulapp.domain.Veterinaria;
import com.firulapp.firulapp.repository.VeterinariaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeterinariaService {

    private final VeterinariaRepository veterinariasRepository;

    //Se crea el repositorio que va a interactuar con las base de datos
    public VeterinariaService(VeterinariaRepository veterinariasRepository) {
        this.veterinariasRepository = veterinariasRepository;
    }



    public List<Veterinaria> buscarDestacados()
    {
        return veterinariasRepository.buscarTodos();


    }

    public List<Veterinaria> findById(String id)
    {
        return veterinariasRepository.findById(id);

    }


    public List<Veterinaria> findByCity(String q)
    {
        return veterinariasRepository.findByCity(q);

    }

}
