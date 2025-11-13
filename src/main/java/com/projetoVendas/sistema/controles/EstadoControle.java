package com.projetoVendas.sistema.controles;

import com.projetoVendas.sistema.modelos.Estado;
import com.projetoVendas.sistema.repositorios.EstadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EstadoControle {

    @Autowired
    private EstadoRepositorio estadoRepositorio;

    @GetMapping("/cadastroEstado")
    public ModelAndView cadastrar(Estado estado){
        ModelAndView mv = new ModelAndView("/administrativo/estado/cadastro");
        mv.addObject("estado",estado);
        return mv;
    }

}
