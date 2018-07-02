/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.FilmeController;
import dao.FilmeDAO;
import java.util.List;
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
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
       FilmeController.inicializar();
       
//       FilmeController.cadastrarFilme("Batman", "Tim Burton", "Warner", "Ação", 1989);
//       FilmeController.cadastrarFilme("Aniquiliação", "XXX", "Netflix", "Ficção", 2018);
//       FilmeController.cadastrarFilme("Star Wars - Ameaça Fantasma", "George Lucas", "Lucas Film", "Ficção", 1999);
    
//         List<Filme> f = FilmeController.filmesByDiretor("Tim Burton");
//         
//         for(Filme fil : f){
//             System.out.println(fil.getDiretor() + fil.getEstudio() + fil.getTitulo());
//         }

//      FilmeController.atualizarFilme("Batman", "The Batman");
      
        FilmeController.removerFilme("The Batman");

        System.out.println("Concluido!\n");
	FilmeController.finalizar();
        
      
    }
    
}
