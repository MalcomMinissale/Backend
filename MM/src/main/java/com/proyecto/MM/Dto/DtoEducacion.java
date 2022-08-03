/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.MM.Dto;


import javax.validation.constraints.NotBlank;

public class dtoEducacion {
    @NotBlank
    private int id;
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    private String iconoE;
    @NotBlank
    private int anioE;
    private String webE;

    public dtoEducacion() {
    }

    public dtoEducacion(int id, String nombreE, String descripcionE, String iconoE, int anioE, String webE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.id = id;
        this.iconoE = iconoE;
        this.anioE = anioE;
        this.webE = webE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getIconoE() {
        return iconoE;
    }

    public void setIconoE(String iconoE) {
        this.iconoE = iconoE;
    }

    public int getAnioE() {
        return anioE;
    }

    public void setAnioE(int anioE) {
        this.anioE = anioE;
    }

    public String getWebE() {
        return webE;
    }

    public void setWebE(String webE) {
        this.webE = webE;
    }

    
    
}