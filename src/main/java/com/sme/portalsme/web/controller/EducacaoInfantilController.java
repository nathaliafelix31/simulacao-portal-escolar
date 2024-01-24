package com.sme.portalsme.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EducacaoInfantilController {

    /*Angela Maria*/
    @RequestMapping({"/educacaoInfantil/angelaMaria/inicio"})
    public String InicioAngela(){

        return "/educacaoInfantil/angelaMaria/inicio.html";
    }

    @RequestMapping({"/educacaoInfantil/angelaMaria/nossasAtividades"})
    public String NossasAtividadesAngela(){

        return "/educacaoInfantil/angelaMaria/nossasAtividades.html";
    }
    @RequestMapping({"/educacaoInfantil/angelaMaria/atividades"})
    public String AtividadesAngela(){

        return "/educacaoInfantil/angelaMaria/atividades.html";
    }

    /*Gilma Leao*/
    @RequestMapping({"/educacaoInfantil/gilmaLeao/inicio"})
    public String InicioGilmaLeao(){

        return "/educacaoInfantil/gilmaLeao/inicio.html";
    }

    @RequestMapping({"/educacaoInfantil/gilmaLeao/nossasAtividades"})
    public String AtividadesGilmaLeao(){

        return "/educacaoInfantil/gilmaLeao/nossasAtividades.html";
    }

    /*Sementinha da Esperança*/
    @RequestMapping({"/educacaoInfantil/sementinhaEsperanca/inicio"})
    public String InicioSementinha(){

        return "/educacaoInfantil/sementinhaEsperanca/inicio.html";
    }

    @RequestMapping({"/educacaoInfantil/sementinhaEsperanca/nossasAtividades"})
    public String AtividadesSementinha(){

        return "/educacaoInfantil/sementinhaEsperanca/nossasAtividades.html";
    }

    /*Sossego da Mamae*/
    @RequestMapping({"/educacaoInfantil/sossegoMamae/inicio"})
    public String InicioSossego(){

        return "/educacaoInfantil/sossegoMamae/inicio.html";
    }

    @RequestMapping({"/educacaoInfantil/sossegoMamae/nossasAtividades"})
    public String AtividadesSossego(){

        return "/educacaoInfantil/sossegoMamae/nossasAtividades.html";
    }

    /*Ubaldina Andrade*/
    @RequestMapping({"/educacaoInfantil/ubaldinaAndrade/inicio"})
    public String InicioUbaldina(){

        return "/educacaoInfantil/ubaldinaAndrade/inicio.html";
    }

    @RequestMapping({"/educacaoInfantil/ubaldinaAndrade/nossasAtividades"})
    public String AtividadesUbaldina(){

        return "/educacaoInfantil/ubaldinaAndrade/nossasAtividades.html";
    }

    /*Ruth Seixas*/
    @RequestMapping({"/educacaoInfantil/ruthSeixas/inicio"})
    public String InicioRuth(){

        return "/educacaoInfantil/ruthSeixas/inicio.html";
    }

    @RequestMapping({"/educacaoInfantil/ruthSeixas/nossasAtividades"})
    public String AtividadesRuth(){

        return "/educacaoInfantil/ruthSeixas/nossasAtividades.html";
    }

    /*Amélia Pacheco*/
    @RequestMapping({"/educacaoInfantil/ameliaPacheco/inicio"})
    public String InicioAmelia(){

        return "/educacaoInfantil/ameliaPacheco/inicio.html";
    }

    @RequestMapping({"/educacaoInfantil/ameliaPacheco/nossasAtividades"})
    public String NossasAtividadesAmelia(){

        return "/educacaoInfantil/ameliaPacheco/nossasAtividades.html";
    }

    @RequestMapping({"/educacaoInfantil/ameliaPacheco/atividades"})
    public String AtividadesAmelia(){

        return "/educacaoInfantil/ameliaPacheco/atividades.html";
    }

    /*Sementinha do Saber*/
    @RequestMapping({"/educacaoInfantil/sementinhaSaber/inicio"})
    public String InicioSementinhaSaber(){

        return "/educacaoInfantil/sementinhaSaber/inicio.html";
    }

    @RequestMapping({"/educacaoInfantil/sementinhaSaber/nossasAtividades"})
    public String AtividadesSementinhaSaber(){

        return "/educacaoInfantil/sementinhaSaber/nossasAtividades.html";
    }

    /*Sonho Infantil*/
    @RequestMapping({"/educacaoInfantil/sonhoInfantil/inicio"})
    public String InicioSonho(){

        return "/educacaoInfantil/sonhoInfantil/inicio.html";
    }

    @RequestMapping({"/educacaoInfantil/sonhoInfantil/nossasAtividades"})
    public String AtividadesSonho(){

        return "/educacaoInfantil/sonhoInfantil/nossasAtividades.html";
    }

}
