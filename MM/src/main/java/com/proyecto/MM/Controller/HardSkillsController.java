/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.MM.Controller;

import com.proyecto.MM.Entity.HardSkills;
import com.proyecto.MM.Service.ServHardSkills;
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
public class HardSkillsController {
    
@Autowired
ServHardSkills servHardSkills;
  
@GetMapping("/hardSkills/mostrar")
@ResponseBody
public List<HardSkills> listHardSkills(){
    
    return servHardSkills.listHardSkills();
}

@PostMapping("/hardSkills/crear")
public void createHardSkill(@RequestBody HardSkills hardSkills){
    servHardSkills.createHardSkill(hardSkills);
}

@PutMapping("/hardSkills/editar/{id}")
public HardSkills edirHardSkills(@RequestBody HardSkills hSkills, @PathVariable Long id){
    
    HardSkills hs = servHardSkills.findHardSkill(id);

    hs.setHabilidad(hSkills.getHabilidad());
    hs.setPorcentaje(hSkills.getPorcentaje());
   
   servHardSkills.createHardSkill(hs);
   return hs;
}

@DeleteMapping("/hardSkills/{id}")
public void deleteHardSkill(@PathVariable Long id){
    servHardSkills.deleteHardSkill(id);
}
}


