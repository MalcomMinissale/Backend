/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.MM.Service;

import com.proyecto.MM.Entity.OtrosProyectos;
import com.proyecto.MM.Repository.RepoOtrosProyectos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServOtrosProyectos {
    @Autowired
    RepoOtrosProyectos repoOtrosProyectos;
    
    public void createOtroProyecto(OtrosProyectos otroProyecto)
    {
        repoOtrosProyectos.save(otroProyecto);
    }
    
    public void deleteOtroProyectos(Long id){
        repoOtrosProyectos.deleteById(id);
    }
    
    public List<OtrosProyectos> listOtrosProyectos(){
      return  repoOtrosProyectos.findAll();
    }
    
    public OtrosProyectos findOtroProyecto(long id){
        OtrosProyectos otroProyecto = repoOtrosProyectos.findById(id).orElse(null);
        return otroProyecto;
    }
}


