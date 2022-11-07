package com.bosonit.ej61springBoot.controllers;

import com.bosonit.ej61springBoot.models.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/index")
public class UsuarioController {

    public List<Usuario> usuarios = new ArrayList<>();

    @GetMapping(value="/name/{name}")
    public List<Usuario> usuarios (@PathVariable String name) {
        List<Usuario> p1 = usuarios.stream().filter((p)-> p.getName().equals(name)).toList();
        return usuarios;
    }

    @PostMapping(value="/useradd")
    public String addUser (@RequestBody Usuario usuario) {
        usuarios.add(usuario);
        return "Se ha añadido el usuario "+ usuario.getName();
    }

}
