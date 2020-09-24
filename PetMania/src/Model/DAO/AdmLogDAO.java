package Model.DAO;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AdmLogDAO {

public boolean checkLogin(String user, String senha){
    
Connection con = ConnectionFactory.getConnection();
PreparedStatement stmt = null;
    
//o ResultSet servirá para guardar os dados que serão imprimidos.
ResultSet rs = null;
boolean check = false;
    
try{
    stmt = con.prepareStatement("SELECT * FROM loginadm WHERE nome = ?  and senha = ?");
    stmt.setString(1, user);
    stmt.setString(2, senha);
    
    //responsável pelas consultas de um banco.
    //os valores serão executados e enviados para o resultset.
    rs = stmt.executeQuery();

  //enquanto existir um valor no rs, ele colocará no objeto e irá para o próximo. 
  if(rs.next()){
   check = true;   
  }

} catch (SQLException ex) {
  JOptionPane.showMessageDialog(null, "Erro ao logar!", "PetMania informa...", JOptionPane.ERROR_MESSAGE);
    System.out.println(ex);

} finally{
//fechando todas as conexões abertas.. =D
ConnectionFactory.closeConnection(con, stmt, rs);
}
return check;
 }      
}
