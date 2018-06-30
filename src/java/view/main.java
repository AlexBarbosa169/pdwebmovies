/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.FilmeDAO;
import dao.FilmeDAOFactory;
import dao.FilmeDAOImpl;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Filme;

/**
 *
 * @author alexs
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("webMooviesPU");
        EntityManager em = factory.createEntityManager();
  
//        Filme f = new Filme();
//        f.setId(1);
//        f.setTitulo("A lagoa azul");
//        f.setEstudio("Universal");
//        f.setDiretor("Albert");        
//        f.setGenero("Comédia");
//        f.setRuntimeId(0);
//        
//        System.out.println(f.getTitulo());
//        
//        FilmeDAOFactory facDao = new FilmeDAOFactory();
//        
//        
////        FilmeDAO daoFilme = facDao.criarFilmeDAO();
//        
//        FilmeDAO fi = facDao.criarFilmeDAO();
//        
//        fi.adicionarFilme(f);

//    FilmeDAO dao = facDao.criarFilmeDAO();
//        System.out.println(dao.getTodosFilmes());
//                        
    }
    
}
