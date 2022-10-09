
package com.firulapp.firulapp.controller;

import com.firulapp.firulapp.domain.Veterinaria;
import com.firulapp.firulapp.service.VeterinariaService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VeterinariaABMController {
    private final VeterinariaService veterinariaService;

    public VeterinariaABMController(VeterinariaService veterinariaService) {
        this.veterinariaService = veterinariaService;
    }

   @RequestMapping({"/veterinarias/crear"})
    public String mostrarFormAlta(Model model) {
        model.addAttribute("veterinaria", new Veterinaria());
        return "views/formulario/formVeterinaria";
    }

   /* @RequestMapping({"/veterinarias/editar"})
    public String mostrarFormEditar(Model model, String id) {
        model.addAttribute("veterinaria", veterinariaService.findById(id));
        return "views/formulario/formVeterinaria";
    }*/



    @GetMapping({"/crud"})
    public String crudVeterinarias(Model model) {
        try {
            List<Veterinaria> veterinarias = this.veterinariaService.buscarDestacados();
            model.addAttribute("veterinarias", veterinarias);
            return "views/crud";
        } catch (Exception var3) {
            model.addAttribute("error", var3.getMessage());
            return "error";
        }
    }

    /*@GetMapping({"/veterinarias/crear/{id}"})
    public String mostrarFormAlta(Model model, @PathVariable("id") String id) {

            if (id == null) {
                model.addAttribute("veterinaria", new Veterinaria());
            } else {
                model.addAttribute("veterinaria", this.veterinariaService.findById(id));
            }

            return "views/formulario/formVeterinaria";

    }

    @PostMapping({"/veterinarias/guardar"})
    public String guardar(Veterinaria veterinaria) {
        System.out.println(veterinaria);
        this.veterinariaService.guardar(veterinaria);
        return "redirect:/";
    }

    @PostMapping({"/formulario/formVeterinaria/{id}"})
    public String guardarVeterinaria(@ModelAttribute("veterinaria") Veterinaria veterinaria, BindingResult result, Model model, @PathVariable("id") String id) {
        if (result.hasErrors()) {
            return "views/formulario/formVeterinaria";
        } else {
            this.veterinariaService.guardar(veterinaria);
            return "redirect:/crud";
        }
    }*/
}
