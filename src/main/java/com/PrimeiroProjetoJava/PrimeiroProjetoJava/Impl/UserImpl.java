package com.PrimeiroProjetoJava.PrimeiroProjetoJava.Impl;

import com.PrimeiroProjetoJava.PrimeiroProjetoJava.Service.UserService;
import com.PrimeiroProjetoJava.PrimeiroProjetoJava.model.User;
import com.PrimeiroProjetoJava.PrimeiroProjetoJava.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> obterTodos() {
        return this.userRepository.findAll();
    }

    @Override
    public User obterPorCodigo(String codigo) {
        return this.userRepository
                .findById(codigo)
                .orElseThrow(()->new IllegalArgumentException("Usuario nao existe."));
    }

    @Override
    public User criarUsuario(User user) {
        return this.userRepository.save(user);
    }
}
