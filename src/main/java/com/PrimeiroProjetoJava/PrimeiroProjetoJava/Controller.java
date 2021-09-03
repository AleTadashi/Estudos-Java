package com.PrimeiroProjetoJava.PrimeiroProjetoJava;

import com.PrimeiroProjetoJava.PrimeiroProjetoJava.Service.UserService;
import com.PrimeiroProjetoJava.PrimeiroProjetoJava.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/greeting")

@RequiredArgsConstructor
public class Controller {

    private final UserService userService;

    private List<User> listaUser= new ArrayList<>();

    @GetMapping ("/userByID/{id}")
    public User user (@PathVariable("id") String id)
    {
        return this.userService.obterPorCodigo(id);
    }

    @GetMapping ("/allUsers")
    public List<User> user ()
    {
        return this.userService.obterTodos();
    }
    @PostMapping("/criarUsuario")
    public User user(@RequestBody User user)
    {
        return this.userService.criarUsuario(user);
    }

}
