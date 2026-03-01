package com.artfalcao.bankClone.usuario;

import com.artfalcao.bankClone.domain.usuario.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<Usuario> getUsuario(@RequestParam UUID id) {
        Usuario usuario = usuarioService.getUser(id);
        return ResponseEntity.ok(usuario);
    }

}
