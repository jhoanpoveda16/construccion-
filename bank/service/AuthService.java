package com.bank.service;

import com.bank.domain.model.Usuario;
import com.bank.repository.BancoRepository;

public class AuthService {

    public Usuario login(String user,String pass){

        Usuario u = BancoRepository.usuarios.get(user);

        if(u!=null && pass.equals("1234")){

            return u;

        }

        return null;

    }

}