/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.MM.Controller;

import com.proyecto.MM.Entity.SoftSkills;
import com.proyecto.MM.Service.ServSoftSkills;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SoftSkillsController {
    
@Autowired
ServSoftSkills servSoftSkills;
  
@GetMapping("/softSkills/mostrar")
@ResponseBody
public List<SoftSkills> listSoftSkills(){
    
    return servSoftSkills.listSoftSkills();
}

@PostMapping("/softSkills/crear")
public void createSoftSkill(@RequestBody SoftSkills softSkills){
    servSoftSkills.createSoftSkill(softSkills);
}

@PutMapping("/softSkills/editar/{id}")
public SoftSkills editSoftSkills(@RequestBody SoftSkills sSkills, @PathVariable Long id){
    
    SoftSkills ss = servSoftSkills.findSoftSkill(id);

    ss.setHabilidad(sSkills.getHabilidad());
    ss.setPorcentaje(sSkills.getPorcentaje());
   
   servSoftSkills.createSoftSkill(ss);
   return ss;
}

@DeleteMapping("/softSkills/{id}")
public void deleteSoftSkill(@PathVariable Long id){
    servSoftSkills.deleteSoftSkill(id);
}
}


