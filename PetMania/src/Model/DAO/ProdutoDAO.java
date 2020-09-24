/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Connection.ConnectionFactory;
import Model.Bean.Produtos;
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
public class ProdutoDAO {
    public void create(Produtos p) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO produtos (produto,preco,qtd)VALUES(?,?,?)");
            stmt.setString(1, p.getProduto());
            stmt.setInt(2, p.getQtd());
            stmt.setDouble(3, p.getPreco());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Produtos> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produtos> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produtos");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produtos produto = new Produtos();

                produto.setId(rs.getInt("id"));
                produto.setProduto(rs.getString("produto"));
                produto.setQtd(rs.getInt("qtd"));
                produto.setPreco(rs.getDouble("preco"));
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return produtos;

    }
    public List<Produtos> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produtos> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produtos WHERE produto LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produtos produto = new Produtos();

                produto.setId(rs.getInt("id"));
                produto.setProduto(rs.getString("produto"));
                produto.setQtd(rs.getInt("qtd"));
                produto.setPreco(rs.getDouble("preco"));
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return produtos;

    }
    
    public void update(Produtos p) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE produtos SET produto = ?,preco = ?,qtd = ? WHERE id = ?");
            stmt.setString(1, p.getProduto());
            stmt.setDouble(2, p.getPreco());
            stmt.setInt(3, p.getQtd());
            stmt.setInt(4, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    public void delete(Produtos p) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM produtos WHERE id = ?");
            stmt.setInt(1, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
}
