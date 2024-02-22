package br.com.fiap.mp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.mp.model.Pedido;

@Controller
@RequestMapping("/")
public class Home {

    @GetMapping
    public String home() {
        return "home";
    }
}









