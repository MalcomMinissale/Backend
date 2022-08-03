package com.proyecto.MM.Repository;

import com.proyecto.MM.Entity.SoftSkills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepoSoftSkills extends JpaRepository<SoftSkills, Long>{

}
