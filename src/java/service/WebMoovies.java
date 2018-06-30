/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
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
    
    List<Filme> filmes = new ArrayList<>();  
    
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
        
        return filme;
    }
    
    @WebMethod(operationName = "getMovieTitle")
    public String getMovieTitle(@WebParam(name = "titulo") String tit) {        
        return "Pesquisa feita pelo título, com entrada: " + tit;
    }
    
    @WebMethod(operationName = "getMovieDiretor")
    public String getMovieDirector(@WebParam(name = "diretor") String dir) {
        return "Pesquisa feita pelo diretor, com entrada: " + dir;
    }
    
    @WebMethod(operationName = "getMovieStudio")
    public String getMovieStudio(@WebParam(name = "estudio") String est) {
        return "Pesquisa feita pelo estúdio, com entrada: " + est;
    }
    
    @WebMethod(operationName = "getMovieGenre")
    public String getMovieGenre(@WebParam(name = "genero") String gen) {
        return "Pesquisa feita pelo genero, com entrada: " + gen;
    }
    
    @WebMethod(operationName = "getMovieAge")
    public String getMovieAge(@WebParam(name = "age") int age) {
        return "Pesquisa feita pelo data de lançamento, com entrada: " + age;
    }
       
}
