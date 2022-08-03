/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.MM.Dto;

import javax.validation.constraints.NotBlank;

public class dtoSoftSkills {
    @NotBlank
    private String habilidad;
    @NotBlank
    private int porcentaje;

    public dtoSoftSkills(String habilidad, int porcentaje) {
        
        this.habilidad = habilidad;
        this.porcentaje = porcentaje;
    }

    public dtoSoftSkills() {
    }

    
    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
}

