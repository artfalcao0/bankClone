package com.artfalcao.bankClone.usuario;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    public String getUser(String id) {
        return "Hello" + id;
    }
}
