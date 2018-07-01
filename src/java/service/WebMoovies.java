/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Filme;

/**
 *
 * @author alexs
 */
@WebService(serviceName = "WebMoovies")
public class WebMoovies {
    
    private List<Filme> filmes = new ArrayList<>();
    
    public WebMoovies(){
        filmes.add(new Filme(1, "a", "a", "a", "a", 1));        
        filmes.add(new Filme(2, "b", "b", "b", "b", 2));        
        filmes.add(new Filme(3, "c", "c", "c", "c", 3));        
        filmes.add(new Filme(4, "d", "d", "d", "d", 3));        
        filmes.add(new Filme(5, "e", "e", "e", "e", 3));        
    }
    
    @WebMethod(operationName = "newMovie")
    public Filme newMovie(@WebParam(name = "id") int id,
                           @WebParam(name = "titulo") String tit,
                           @WebParam(name = "diretor") String dir,
                           @WebParam(name = "estudio") String est,
                           @WebParam(name = "genero") String gen,
                           @WebParam(name = "lancamento") int data) {
        Filme filme = new Filme();
        
        filme.setId(id);
        filme.setTitulo(tit);
        filme.setDiretor(dir);
        filme.setGenero(gen);
        filme.setEstudio(est);
        filme.setAnoLancamento(data);
        filmes.add(filme);
        return filme;
    }
    
    @WebMethod(operationName = "getMovieTitle")
    public List<Filme> getMovieTitle(@WebParam(name = "titulo") String tit) {
        List<Filme> buscaFilmes = new ArrayList<>();
        for(Filme f : filmes){
            if(f.getTitulo().equals(tit)){
                buscaFilmes.add(f);
            }
        }
        return buscaFilmes;
    }
    
    @WebMethod(operationName = "getMovieDiretor")
    public List<Filme> getMovieDirector(@WebParam(name = "diretor") String dir) {
        List<Filme> buscaFilmes = new ArrayList<>();
        for(Filme f : filmes){
            if(f.getDiretor().equals(dir)){
                buscaFilmes.add(f);
            }
        }
        return buscaFilmes;
    }
    
    @WebMethod(operationName = "getMovieStudio")
    public List<Filme> getMovieStudio(@WebParam(name = "estudio") String est) {
        List<Filme> buscaFilmes = new ArrayList<>();
        for(Filme f : filmes){
            if(f.getEstudio().equals(est)){
                buscaFilmes.add(f);
            }
        }
        return buscaFilmes;
    }
    
    @WebMethod(operationName = "getMovieGenre")
    public List<Filme> getMovieGenre(@WebParam(name = "genero") String gen) {
        List<Filme> buscaFilmes = new ArrayList<>();
        for(Filme f : filmes){
            if(f.getGenero().equals(gen)){
                buscaFilmes.add(f);
            }
        }
        return buscaFilmes;
    }
    
    @WebMethod(operationName = "getMovieAge")
    public List<Filme> getMovieAge(@WebParam(name = "age") int age) {
        List<Filme> buscaFilmes = new ArrayList<>();
        for(Filme f : filmes){
            if(f.getAnoLancamento()==age){
                buscaFilmes.add(f);
            }
        }
        return buscaFilmes;
    }
       
    @WebMethod(operationName = "getAllMovies")
    public List<Filme> getMovieTeste() {
        return filmes;
    }
}
