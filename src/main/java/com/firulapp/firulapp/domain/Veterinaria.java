
package com.firulapp.firulapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Veterinaria {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer idVeterinaria;
    private String nombre;
    private String especialidad;
    private String propietario;
    private String horario;
    private String rangoPrecios;
    private String servicios;
    private String fotos;
    private String ciudad;
    private String telefono;
    private String masInformacion;

    public Veterinaria() {
    }

    public Integer getIdVeterinaria() {
        return this.idVeterinaria;
    }

    public void setIdVeterinaria(Integer idVeterinaria) {
        this.idVeterinaria = idVeterinaria;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getPropietario() {
        return this.propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getHorario() {
        return this.horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getRangoPrecios() {
        return this.rangoPrecios;
    }

    public void setRangoPrecios(String rangoPrecios) {
        this.rangoPrecios = rangoPrecios;
    }

    public String getServicios() {
        return this.servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public String getFotos() {
        return this.fotos;
    }

    public void setFotos(String fotos) {
        this.fotos = fotos;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMasInformacion() {
        return this.masInformacion;
    }

    public void setMasInformacion(String masInformacion) {
        this.masInformacion = masInformacion;
    }

    public String toString() {
        return "Veterinaria{idVeterinaria=" + this.idVeterinaria + ", nombre='" + this.nombre + "', especialidad='" + this.especialidad + "', propietario='" + this.propietario + "', horario='" + this.horario + "', rangoPrecios='" + this.rangoPrecios + "', servicios='" + this.servicios + "', fotos='" + this.fotos + "', ciudad='" + this.ciudad + "', telefono='" + this.telefono + "', masInformacion='" + this.masInformacion + "'}";
    }
}
