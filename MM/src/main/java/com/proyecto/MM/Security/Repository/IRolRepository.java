/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.MM.Security.Repository;

import com.proyecto.MM.Security.Entity.Rol;
import com.proyecto.MM.Security.Enums.RolNombre;
import java.util.Optional;

/**
 *
 * @author malco
 */
public interface IRolRepository {

    public Optional<Rol> findByRolNombre(RolNombre rolNombre);

    public void save(Rol rol);
    
}
