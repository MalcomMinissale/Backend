/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.MM.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {
    @NotBlank
    private String nombreExp;
    @NotBlank
    private String descripcionExp;
    
    private String logoExp;
    
    //Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreExp, String descripcionExp, String logoExp) {
        this.nombreExp = nombreExp;
        this.descripcionExp = descripcionExp;
     
        this.logoExp = logoExp;
    }

    public String getNombreExp() {
        return nombreExp;
    }

    public void setNombreExp(String nombreExp) {
        this.nombreExp = nombreExp;
    }

    public String getDescripcionExp() {
        return descripcionExp;
    }

    public void setDescripcionExp(String descripcionExp) {
        this.descripcionExp = descripcionExp;
    }


    public String getLogoExp() {
        return logoExp;
    }

    public void setLogoExp(String logoExp) {
        this.logoExp = logoExp;
    }

   
    }
   

    

