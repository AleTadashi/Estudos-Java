package com.PrimeiroProjetoJava.PrimeiroProjetoJava;

import com.PrimeiroProjetoJava.PrimeiroProjetoJava.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")

public class Controller {

    @GetMapping ("/")
    public User user ()
    {
        User user = new User();
        user.setId(1L);
        user.setName("Alexandre Tadashi Shiraiwa");
        user.setUserName("TATA");
        return user;
    }

}
