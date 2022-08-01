
package com.proyecto.MM.Security.Service;

import com.proyecto.MM.Security.Entity.Rol;
import com.proyecto.MM.Security.Entity.Usuario;
import com.proyecto.MM.Security.Enums.RolNombre;
import com.proyecto.MM.Security.Repository.IRolRepository;
import com.proyecto.MM.Security.Repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    IUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario(nombreUsuario); 
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
        
    }
     public boolean existsByEmail(String email){
        return iusuarioRepository.existsByEmail(email);
        
    }
     public void save(Usuario usuario){
          iusuarioRepository.save(usuario);
     }
}