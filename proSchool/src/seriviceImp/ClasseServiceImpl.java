/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriviceImp;

import com.mysql.jdbc.Connection;
import service.Iservice;
import entity.*;
import connexion.Connect;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author user
 */
public class ClasseServiceImpl implements Iservice<Classe>{

        final static private String ID             = "ID";
    final static private String NOM            = "NOM";
    final static private String NIVEAU         = "NIVEAU";
    final static private String ANNEESCOLAIRE          = "ANNEESCOLAIRE";
    final static private String TABLE          = "classe";

   
    private static  Connection   cnx          = Connect.getInstance().getConnection();

    @Override
    public boolean add(Classe t) throws SQLException {
   String            request = "INSERT INTO `" + TABLE + "` (`" + ID + "`,`" + NOM + "`,`"
                + NIVEAU + "`,`" + ANNEESCOLAIRE + "`)"
                + "VALUES (?, ?, ?,?)";

        PreparedStatement pst=cnx.prepareStatement(request);
        pst.setInt(1, t.getId());
        pst.setString(2, t.getNom());
        pst.setInt(3, t.getNiveau());
        pst.setString(4, t.getAnneeScolaire());
        pst.executeUpdate();
        pst.close();
        return true;
    }

    @Override
    public boolean update(Classe t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Classe t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Classe> searchAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Classe> search(Classe t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
