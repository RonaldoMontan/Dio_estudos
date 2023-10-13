package br.com.ronaldomontan.todolist.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController // retorno API
@RequestMapping("/users")
public class UserController {
    
    /*
     * GET - busca uma informação
     * POST - adicionar uma informação
     * PUT - alterar uma informação/dado
     * DELETE - remover dado
     * PATCH - alterar somente uma parte da info/dado
     */

    @PostMapping("/")
    public void create(@RequestBody UserModel userModel){
        System.out.println(userModel.getName());
        System.out.println(userModel.hashCode());
    }
}
