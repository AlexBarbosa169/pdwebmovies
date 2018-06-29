/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import model.Filme;

/**
 *
 * @author alexs
 */
public class FilmeDAOImpl implements FilmeDAO{
  
private EntityManager em;
  
public FilmeDAOImpl(EntityManager em) {
this.em = em;
}
  
@Override
public void adicionarFilme(Filme filme) {
em.persist(filme);
}
  
@Override
public Filme getFilme(int id) {
return getTodosFilmes().get(id);
}
  
@Override
public void removerFilme(int id) {
em.remove(getFilme(id));
}
  
@Override
public void atualizarFilme(Filme filme) {
em.merge(filme);
}
  
@Override
public List<Filme> getTodosFilmes() {
return em.createQuery("SELECT filme FROM Filme filme", Filme.class).getResultList();
}
}
