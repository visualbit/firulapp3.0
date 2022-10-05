package com.firulapp.firulapp.controller;
import org.springframework.stereotype.Controller;
import com.firulapp.firulapp.service.VeterinariaService;
import com.firulapp.firulapp.domain.Veterinaria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ListadoController {

    private final VeterinariaService veterinariaService;

    public ListadoController(VeterinariaService veterinariaService) {
        this.veterinariaService = veterinariaService;
    }


    @RequestMapping ("/")
    public String listarVeterinarias(Model model){

        List<Veterinaria> destacados = veterinariaService.buscarDestacados();
        model.addAttribute("veterinarias", destacados);

        return "index";
    }

    @GetMapping(value = "/detalle")
    public String busquedaVeterinariaId(Model model, @RequestParam(value ="idVet",required = false)String id){
        try {
            List<Veterinaria> detail = this.veterinariaService.findById(id);;
            model.addAttribute("veterinarias", detail);
            model.addAttribute("resultado",id);
            return "detalleClinica";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "error";
        }
    }


    @GetMapping(value = "/busqueda")
    public String busquedaVeterinaria(Model model, @RequestParam(value ="query",required = false)String q){
        try {
            List<Veterinaria> cities = this.veterinariaService.findByCity(q);;
            model.addAttribute("veterinarias", cities);
            model.addAttribute("resultado",q);
            return "busquedaClinicas";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "error";
        }
    }


}
