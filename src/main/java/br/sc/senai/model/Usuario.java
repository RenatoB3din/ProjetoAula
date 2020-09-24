package br.sc.senai.model;

import java.util.Date;

    public class Usuario {

        private Integer id;
        private String nome;
        private String email;
        private String senha;
        private String celular;
        private Date dtNascimento;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }

        public String getCelular() {
            return celular;
        }

        public void setCelular(String celular) {
            this.celular = celular;
        }

        public Date getDtNascimento() {
            return dtNascimento;
        }

        public void setDtNascimento(Date dtNascimento) {
            this.dtNascimento = dtNascimento;
        }
}
