/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Connection.ConnectionFactory;
import Model.Bean.Servicos;
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
public class ServicoDAO {
    public void create(Servicos s) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO servicos (nome,especie,altura,sexo,servico,obs,valorserv)VALUES(?,?,?,?,?,?,?)");
            stmt.setString(1, s.getNome());
            stmt.setString(2, s.getEspecie());
            stmt.setString(3, s.getAltura());
            stmt.setString(4, s.getSexo());
            stmt.setString(5, s.getServico());
            stmt.setString(6, s.getObs());
            stmt.setDouble(7, s.getValorserv());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Servicos> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Servicos> servicos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM servicos");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Servicos servico = new Servicos();

                servico.setId(rs.getInt("id"));
                servico.setNome(rs.getString("nome"));
                servico.setEspecie(rs.getString("especie"));
                servico.setAltura(rs.getString("altura"));
                servico.setSexo(rs.getString("sexo"));
                servico.setServico(rs.getString("servico"));
                servico.setObs(rs.getString("obs"));
                servico.setValorserv(rs.getDouble("valorserv"));
                servicos.add(servico);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return servicos;

    }
    public List<Servicos> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Servicos> servicos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM servicos WHERE nome LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Servicos servico = new Servicos();
                
                servico.setId(rs.getInt("id"));
                servico.setNome(rs.getString("nome"));
                servico.setEspecie(rs.getString("especie"));
                servico.setAltura(rs.getString("altura"));
                servico.setSexo(rs.getString("sexo"));
                servico.setServico(rs.getString("servico"));
                servico.setObs(rs.getString("obs"));
                servico.setValorserv(rs.getDouble("valorserv"));
                servicos.add(servico);
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return servicos;

    }
    
    /*public void update(Servicos p) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE produtos SET produto = ?,preco = ?,qtd = ? WHERE id = ?");
            stmt.setString(1, p.getProduto());
            stmt.setInt(2, p.getQtd());
            stmt.setDouble(3, p.getPreco());
            stmt.setInt(4, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }*/
    public void delete(Servicos p) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM servicos WHERE id = ?");
            stmt.setInt(1, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Serviço realizado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public void update(Servicos p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String checkLogin(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


