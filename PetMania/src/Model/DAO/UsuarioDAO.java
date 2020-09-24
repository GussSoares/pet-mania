/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Connection.ConnectionFactory;
import Model.Bean.Produtos;
import Model.Bean.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aline
 */
public class UsuarioDAO {
    public void create(Usuarios u) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO usuarios (nome, email, senha, cpf, telefone, endereco)VALUES(?,?,?,?,?,?)");
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getEmail());
            stmt.setString(3, u.getSenha());
            stmt.setString(4, u.getCpf());
            stmt.setString(5, u.getTelefone());
            stmt.setString(6, u.getEndereco());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    public List<Usuarios> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Usuarios> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM usuarios");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Usuarios usuario = new Usuarios();
               
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return usuarios;

    }
    public List<Usuarios> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Usuarios> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM usuarios WHERE nome LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Usuarios usuario = new Usuarios();

                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEndereco(rs.getString("endereco"));
                usuarios.add(usuario);            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return usuarios;

    }
    
    public void update(Usuarios p) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE usuarios SET nome = ?,email = ?,senha = ? nome = ?,cpf = ?,telefone = ?,endereco = ? WHERE id = ?");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getEmail());
            stmt.setString(3, p.getSenha());
            stmt.setString(4, p.getCpf());
            stmt.setString(5, p.getTelefone());
            stmt.setString(6, p.getEndereco());
            //stmt.setInt(4, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
}
