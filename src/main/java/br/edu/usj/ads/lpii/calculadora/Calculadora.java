package br.edu.usj.ads.lpii.calculadora;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Calculadora {

    @PostMapping(value="/calcula")
    public ModelAndView postCalcula(@RequestParam String numero1, @RequestParam String numero2) {
        
        ModelAndView modelAndView = new ModelAndView();
        
        
        return modelAndView;
    }
    


}