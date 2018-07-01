/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Filme;

/**
 *
 * @author alexs
 */
public class Filmes {
    private List<Filme> filmes;

    public Filmes() {
        this.filmes.add(new Filme(1,"a","a","a","a",1));
        this.filmes.add(new Filme(2,"b","b","b","b",2));
        this.filmes.add(new Filme(3,"c","c","c","c",3));
        this.filmes.add(new Filme(4,"d","d","d","d",4));
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }
       
    
}
