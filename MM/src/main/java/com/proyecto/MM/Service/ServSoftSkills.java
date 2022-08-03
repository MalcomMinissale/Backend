/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.proyecto.MM.Service;


import com.proyecto.MM.Entity.SoftSkills;
import com.proyecto.MM.Repository.RepoSoftSkills;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServSoftSkills {
    @Autowired
    RepoSoftSkills repoSoftSkills;
    
    public void createSoftSkill(SoftSkills softSkills)
    {
        repoSoftSkills.save(softSkills);
    }
    
    public void deleteSoftSkill(Long id){
        repoSoftSkills.deleteById(id);
    }
    
    public List<SoftSkills> listSoftSkills(){
      return  repoSoftSkills.findAll();
    }
    
     public SoftSkills findSoftSkill(Long id){
        SoftSkills sSkills = repoSoftSkills.findById(id).orElse(null);
        return sSkills;
    }
}
