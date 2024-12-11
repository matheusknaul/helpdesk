package com.matheusknaul.helpdesk.domain;

import com.matheusknaul.helpdesk.domain.enums.Perfil;

import java.util.Set;

public class Cliente extends Pessoa{

    private static final long serialVersionUID = 1L;

    public Cliente(){
        super();
        addPerfil(Perfil.CLIENTE);
    }

    public Cliente(Integer id, String nome, String cpf, String email, String senha, Set<Integer> perfis){
        super(id, nome, cpf, email, senha, perfis);
        addPerfil(Perfil.CLIENTE);
    }
}
