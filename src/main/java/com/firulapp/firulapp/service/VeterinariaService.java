//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.firulapp.firulapp.service;

import com.firulapp.firulapp.domain.Veterinaria;
import com.firulapp.firulapp.repository.VeterinariaRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class VeterinariaService {
    private final VeterinariaRepository veterinariasRepository;

    public VeterinariaService(VeterinariaRepository veterinariasRepository) {
        this.veterinariasRepository = veterinariasRepository;
    }

    public List<Veterinaria> buscarDestacados() {
        return this.veterinariasRepository.buscarTodos();
    }

    public List<Veterinaria> findById(String id) {
        return this.veterinariasRepository.findById(id);
    }

    public List<Veterinaria> findByCity(String q) {
        return this.veterinariasRepository.findByCity(q);
    }

    public Veterinaria guardar(Veterinaria veterinaria) {
        return (Veterinaria)this.veterinariasRepository.save(veterinaria);
    }


}
