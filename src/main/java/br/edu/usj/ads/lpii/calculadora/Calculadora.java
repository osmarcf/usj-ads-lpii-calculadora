package br.edu.usj.ads.lpii.calculadora;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class Calculadora {

    @PostMapping(value="path")
    public SomeEnityData postMethodName(@RequestBody SomeEnityData entity) {
        //TODO: process POST request
        
        return entity;
    }
    


}