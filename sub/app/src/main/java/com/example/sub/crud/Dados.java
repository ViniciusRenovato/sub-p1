package com.example.sub.crud;

import java.util.Collection;
import java.util.List;
import java.util.LinkedList;

public class Dados {
    private static final List  dados = new LinkedList();
    private static Integer count=1;
    private Dados(){
    }
    public static void salvar(Object o){
        if(dados.contains(o))
            dados.set(dados.indexOf(o),o);
        else dados.add(o);
    }
    public static void salvar(Collection o){
        dados.addAll(o);
    }
    public static List getLista(){
        return dados;
    }
}
