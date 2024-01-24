package com.sme.portalsme.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EnsinoFundamentalController {

    /*Amelia Pacheco*/
    @RequestMapping({"/ensinoFundamental/ameliaPacheco/inicio"})
    public String InicioAmelia(){

        return "/ensinoFundamental/ameliaPacheco/inicio.html";
    }

    @RequestMapping({"/ensinoFundamental/ameliaPacheco/nossasAtividades"})
    public String AtividadesAmelia(){

        return "/ensinoFundamental/ameliaPacheco/nossasAtividades.html";
    }

    /*Amerindo Bezerra*/
    @RequestMapping({"/ensinoFundamental/amerindoBezerra/inicio"})
    public String InicioAmerindo(){

        return "/ensinoFundamental/amerindoBezerra/inicio.html";
    }

    @RequestMapping({"/ensinoFundamental/amerindoBezerra/nossasAtividades"})
    public String AtividadesAmerindo(){

        return "/ensinoFundamental/amerindoBezerra/nossasAtividades.html";
    }


    /*Diogo Feijó*/
    @RequestMapping({"/ensinoFundamental/diogoFeijo/inicio"})
    public String InicioDiogo(){

        return "/ensinoFundamental/diogoFeijo/inicio.html";
    }

    @RequestMapping({"/ensinoFundamental/diogoFeijo/nossasAtividades"})
    public String AtividadesDiogo(){

        return "/ensinoFundamental/diogoFeijo/nossasAtividades.html";
    }

    /*Osório Evangelista*/
    @RequestMapping({"/ensinoFundamental/osorioEvangelista/inicio"})
    public String InicioOsorio(){

        return "/ensinoFundamental/osorioEvangelista/inicio.html";
    }

    @RequestMapping({"/ensinoFundamental/osorioEvangelista/nossasAtividades"})
    public String AtividadesOsorio(){

        return "/ensinoFundamental/osorioEvangelista/nossasAtividades.html";
    }

    /*Carmem Maria*/
    @RequestMapping({"/ensinoFundamental/carmemMaria/inicio"})
    public String InicioCarmem(){

        return "/ensinoFundamental/carmemMaria/inicio.html";
    }

    @RequestMapping({"/ensinoFundamental/carmemMaria/nossasAtividades"})
    public String AtividadesCarmem(){

        return "/ensinoFundamental/carmemMaria/nossasAtividades.html";
    }

  /*Noeme Sales*/
    @RequestMapping({"/ensinoFundamental/noemeSales/inicio"})
    public String InicioNoeme(){

        return "/ensinoFundamental/noemeSales/inicio.html";
    }

    @RequestMapping({"/ensinoFundamental/noemeSales/nossasAtividades"})
    public String AtividadesNoeme(){

        return "/ensinoFundamental/noemeSales/nossasAtividades.html";
    }

}
