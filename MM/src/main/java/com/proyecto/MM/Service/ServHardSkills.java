/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.MM.Service;


import com.proyecto.MM.Entity.HardSkills;
import com.proyecto.MM.Repository.RepoHardSkills;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServHardSkills {
    @Autowired
    RepoHardSkills repoHardSkills;
    
    public void createHardSkill(HardSkills hardSkills)
    {
        repoHardSkills.save(hardSkills);
    }
    
    public void deleteHardSkill(Long id){
        repoHardSkills.deleteById(id);
    }
    
    public List<HardSkills> listHardSkills(){
      return  repoHardSkills.findAll();
    }
    
     public HardSkills findHardSkill(Long id){
        HardSkills hSkills = repoHardSkills.findById(id).orElse(null);
        return hSkills;
    }
}
