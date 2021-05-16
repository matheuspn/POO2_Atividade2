/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

/**
 * Classe abstrata que define um método para execução de querrys.
 * @author matpr
 */
public abstract class TMConectaBD { 
    
    /**
     * Método usado para executar uma querry no banco de dados.
     * @param url URL do jdbc que será usado na querry.
     */
    abstract void executa(String url); 
    
}
