package com.PrimeiroProjetoJava.PrimeiroProjetoJava;

import com.PrimeiroProjetoJava.PrimeiroProjetoJava.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/greeting")


public class Controller {

    private List<User> listaUser= new ArrayList<>();

    @GetMapping ("/userByID/{id}")
    public User user (@PathVariable("id") Long id)
    {
        Optional<User> userFind = listaUser.stream().filter(user ->user.getId().equals(id)).findFirst();
        if (userFind.isPresent()){
            return userFind.get();
        }

        return  null;
    }
    @PostMapping("/")
    public User user(@RequestBody User user)
    {
        listaUser.add(user);
        return user;
    }
    @GetMapping("/listAllUser")

    public List<User> list()
    {
        return listaUser;
    }
}
