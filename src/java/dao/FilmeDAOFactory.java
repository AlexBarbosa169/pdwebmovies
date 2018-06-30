/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alexs
 */
@ApplicationScoped
public class FilmeDAOFactory {
  
@PersistenceContext(unitName="webMooviesPU")
private EntityManager em;
  
@Produces
public FilmeDAO criarFilmeDAO() {
         //Em FilmeDAOImpl(em) passamos o Entity Manager criado
return new FilmeDAOImpl(em);
}

}
