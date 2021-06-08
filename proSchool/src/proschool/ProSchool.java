/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proschool;

import connexion.Connect;
import entity.Classe;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import seriviceImp.ClasseServiceImpl;

/**
 *
 * @author user
 */
public class ProSchool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Connect.getInstance().getConnection());
                System.out.println(Connect.getInstance().getConnection());

                        System.out.println(Connect.getInstance().getConnection());

                        
                        
        Classe c  = new Classe();
        c.setAnneeScolaire("2020/2021");
        c.setNiveau(1);
        c.setNom("A");
        
        ClasseServiceImpl cmpl= new ClasseServiceImpl();
        
        try {
            System.out.println("***** yet *****");
            cmpl.add(c);
            System.out.println("****** done *****");
        } catch (SQLException ex) {
            Logger.getLogger(ProSchool.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
