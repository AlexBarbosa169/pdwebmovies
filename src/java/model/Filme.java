/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 *
 * @author alexs
 */
@Entity
public class Filme implements Serializable {

    private static final long serialVersionUID = -6580012241620579129L;
//   título, diretor, estúdio, gênero e ano de lançamento,
    @Id
    @GeneratedValue
    private int id;

    private String titulo;

    private String diretor;

    private String estudio;

    private String genero;

    private int anoLancamento;

    //Essa anotação indica que o atributo não é persistente
    @Transient
    private int runtimeId;

    public Filme(int id, String titulo, String diretor, String estudio, String genero, int anoLancamento) {
        this.id = id;
        this.titulo = titulo;
        this.diretor = diretor;
        this.estudio = estudio;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    public Filme() {
    }

    //getters e setters dos atributos
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    
    

    public int getRuntimeId() {
        return this.runtimeId;
    }

    public void setRuntimeId(int runtimeId) {
        this.runtimeId = runtimeId;
    }

}
