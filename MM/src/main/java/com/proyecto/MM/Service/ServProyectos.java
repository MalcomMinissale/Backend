/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.MM.Service;

import com.proyecto.MM.Entity.Proyectos;
import com.proyecto.MM.Repository.RepoProyectos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServProyectos {
    @Autowired
    RepoProyectos repoProyectos;
    
    public void createProyecto(Proyectos proyecto)
    {
        repoProyectos.save(proyecto);
    }
    
    public void deleteProyectos(Long id){
        repoProyectos.deleteById(id);
    }
    
    public List<Proyectos> listProyectos(){
      return  repoProyectos.findAll();
    }
    
    public Proyectos findProyecto(long id){
        Proyectos proyecto = repoProyectos.findById(id).orElse(null);
        return proyecto;
    }
}

