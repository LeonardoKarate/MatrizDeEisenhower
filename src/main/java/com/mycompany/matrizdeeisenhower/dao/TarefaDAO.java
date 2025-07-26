/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matrizdeeisenhower.dao;

import java.util.ArrayList;
import com.mycompany.matrizdeeisenhower.Tarefa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author leona
 */
public class TarefaDAO {
    
    public ArrayList<Tarefa> minhaLista = new ArrayList<>();
    
    public Connection getConexao() {
        Connection conection = null;
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            
            String server = "localhost";
            String database = "db_tarefas";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "root!";
            
            conection =DriverManager.getConnection(url, user, password);
            
            if (conection != null) {
                System.out.println("Conectado");                
            } else {
                System.out.println("Não conectado");
            }
            
            return conection;
            
        } catch (ClassNotFoundException e) {
            System.out.println("o drive não foi encontrado" + e.getMessage());
            return null;
        }   catch (SQLException e) {
            System.out.println("não foi possivel conectar");
            return null;
        }
    }
    
    public ArrayList<Tarefa> getAll() {
        
        minhaLista.clear();
        
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_tarefas");
            
            while (res.next()) {                
                int id = res.getInt("id");
                String descricao = res.getString("descricao");
                String titulo = res.getString("titulo");
                boolean importante = res.getBoolean("importante");
                boolean urgente = res.getBoolean("urgente");
                boolean feito = res.getBoolean("feito");
                
                Tarefa objeto = new Tarefa(id, titulo, descricao, urgente, importante, feito);
                minhaLista.add(objeto);
            }
            stmt.close();
            
        } catch (SQLException e) {
            System.out.println("Erro:" + e);
        }
        return minhaLista;
    }
    
}
