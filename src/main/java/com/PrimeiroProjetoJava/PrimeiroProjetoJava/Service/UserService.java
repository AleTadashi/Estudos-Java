package com.PrimeiroProjetoJava.PrimeiroProjetoJava.Service;

import com.PrimeiroProjetoJava.PrimeiroProjetoJava.model.User;

import java.util.List;

public interface UserService {

    public List<User> obterTodos();
    public User obterPorCodigo(String codigo);
    public User criarUsuario(User user);
}
