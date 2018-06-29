/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Filme;

/**
 *
 * @author alexs
 */
public interface FilmeDAO {
  
         public void adicionarFilme(Filme filme);
  
         public Filme getFilme(int id);
  
         public void removerFilme(int id);
  
         public void atualizarFilme(Filme filme);
  
         public List<Filme> getTodosFilmes();
  
}
