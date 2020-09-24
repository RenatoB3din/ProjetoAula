package br.sc.senai.service;

import javassist.NotFoundException;

public class UsuarioService {
    public String login(String email, String senha){
        if (email != null && senha != null){
            if(email.isEmpty()){
                throw new NotFoundException("O campo email não foi preenchido");
            }
            if(senha.isEmpty()){
                throw new NotFoundException("Senha incorreta");
            }

            // Chamar repositório usuário

            return "Logou";
        }
    }
}
