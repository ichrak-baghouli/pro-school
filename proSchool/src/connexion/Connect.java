/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Connect {
    
Connection cnx ;
    static Connect connectInstance;
   
    String url = "jdbc:mysql://127.0.0.1:3306/school";
    String login = "root";
    String password = "";
   
   
   private Connect (){
       
       
        try {
   cnx = (Connection) DriverManager.getConnection(url ,login, password);


            System.out.println("Connexion établie avec succès");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
   System.out.println("#########################################");

        }

    }
    // Utilisation de la méthode singleton
public static Connect getInstance() {
if (connectInstance == null) {
connectInstance = new Connect();

}
return connectInstance;
}
   
   

public Connection getConnection() {
return cnx;
}
}
