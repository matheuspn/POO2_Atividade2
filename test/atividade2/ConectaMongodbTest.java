/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matpr
 */
public class ConectaMongodbTest {
    
    public ConectaMongodbTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getConectaMongoBD method, of class ConectaMongodb.
     */
    @Test
    public void testGetConectaMongoBD() {
        System.out.println("getConectaMongoBD");
        ConectaMongodb expResult = null;
        ConectaMongodb result = ConectaMongodb.getConectaMongoBD();
        assertEquals(expResult, result);
    }

    /**
     * Test of setParams method, of class ConectaMongodb.
     */
    @Test
    public void testSetParams() {
        System.out.println("setParams");
        String placa_mae = "";
        String processador = "";
        int RAM = 0;
        String HD = "";
        String SSD = "";
        String placa_video = "";
        ConectaMongodb instance = new ConectaMongodb();
        instance.setParams(placa_mae, processador, RAM, HD, SSD, placa_video);
    }

    /**
     * Test of insere method, of class ConectaMongodb.
     */
    @Test
    public void testInsere() {
        System.out.println("insere");
        ConectaMongodb instance = new ConectaMongodb();
        instance.insere();
    }
    
}
