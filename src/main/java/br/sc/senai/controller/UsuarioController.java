package br.sc.senai.controller;

public class UsuarioController {

    @PostMapping("/usuario")
    public String cadastroUsuario(Usuario usuario) {
        return "login";
    }

    @GetMapping("/usuario/login")
    public String login(String email, String senha) {

        return Usuario;
    }
}
