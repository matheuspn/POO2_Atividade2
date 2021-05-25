/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe que realiza a conexão com banco de dados MySQL.
 * 
 * @version 2021
 * @author matpr
 */
public class ConectaBD extends TMConectaBD {
    
    private static ConectaBD conectado;
    private String placa_mae, processador, HD, SSD, placa_video;
    private int RAM;
    
    /**
     * Construtor privado da classe ConectaBD
     * @see getConectaBD
     */
    private void conectaBD(){
            
	 }
 
    /**
     * Método estático da classe ConectadaBD, só pode haver um único objeto desta classe.
     * @return Retorna o objeto criado.
     */
    public static ConectaBD getConectaBD(){
        
        if(conectado == null){
            conectado = new ConectaBD();
        }
        return conectado;
    }
    
    /**
     * Método que recebe os parâmetros que devem ser passados ao banco de dados
     * 
     * @param placa_mae 
     * @param processador
     * @param RAM
     * @param HD
     * @param SSD
     * @param placa_video 
     */
    public void setParams(String placa_mae, String processador, int RAM, String HD, String SSD, String placa_video){
        this.placa_mae = placa_mae;
        this.processador = processador;
        this.RAM = RAM;
        this.HD = HD;
        this.SSD = SSD;
        this.placa_video = placa_video;
    }
    
    /**
     * Realiza a conexão com o banco de dados e executa a inserção dos dados.
     */
    @Override
    public void insere(){
        
        String url = "jdbc:mysql://localhost:3306/poo2";
        Connection con = null;
        try {

            con = (Connection)DriverManager.getConnection(url,"root"," ");
            Statement stm = con.createStatement();          
            String comando ="insert into computador values(0,"+"'"+this.placa_mae+"'"+", "+"'"+this.processador+"'"+","+this.RAM+","+ "'"+this.HD+"'"+","+"'"+this.SSD+"'"+","+"'"+this.placa_video+"'"+");" ;   
            stm.execute(comando);                     

        } catch (SQLException ex) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
        } finally{                                         
            if(con != null) try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}


