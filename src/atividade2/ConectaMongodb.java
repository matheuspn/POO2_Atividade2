/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import static com.mongodb.client.model.Filters.*;
import org.bson.types.ObjectId;

import java.util.Random;

/**
 ** Classe que realiza a conexão com banco de dados MongoDB.
 * 
 * @version 2021
 * @author matpr
 */
public class ConectaMongodb extends TMConectaBD {

    private MongoClient mongoClient = new MongoClient("localhost", 27017);
    private MongoDatabase database = mongoClient.getDatabase("loja");
    private MongoCollection<Document> collection = database.getCollection("computador");
    private static ConectaMongodb conectado;
    private String placa_mae, processador, HD, SSD, placa_video;
    private int RAM;
    
    /**
     * Construtor privado da classe ConectaMongodb
     * @see getConectaMongoBD
     */
    private void ConectaMongodb() {
        
    }
    
    /**
     * Método estático da classe ConectadaMongoBD, só pode haver um único objeto desta classe.
     * @return Retorna o objeto criado.
     */
    public static ConectaMongodb getConectaMongoBD(){
        
        if(conectado == null){
            conectado = new ConectaMongodb();
            
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
    void insere() {
        
        Random aleatorio = new Random();
        // gerando valor aleatório entre 1 e 1000 para servir de chave
        int valor = aleatorio.nextInt(1000) + 1;
        Document doc = new Document("id", valor).append("placa mae",placa_mae)
                .append("processador",processador).append("SSD", SSD).append("HD", HD)
                .append("placa de video", placa_video);
        collection.insertOne(doc);
    }
}

