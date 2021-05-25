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
public class ConectaBDTest {
    
    public ConectaBDTest() {
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
     * Test of getConectaBD method, of class ConectaBD.
     */
    @Test
    public void testGetConectaBD() {
        System.out.println("getConectaBD");
        ConectaBD expResult = null;
        ConectaBD result = ConectaBD.getConectaBD();
        assertEquals(expResult, result);
    }

    /**
     * Test of setParams method, of class ConectaBD.
     */
    @Test
    public void testSetParams() {
        System.out.println("setParams");
        String placa_mae = "teste";
        String processador = "teste";
        int RAM = 0;
        String HD = "teste";
        String SSD = "teste";
        String placa_video = "teste";
        ConectaBD instance = new ConectaBD();
        instance.setParams(placa_mae, processador, RAM, HD, SSD, placa_video);
    }

    /**
     * Test of insere method, of class ConectaBD.
     */
    @Test
    public void testInsere() {
        System.out.println("insere");
        ConectaBD instance = new ConectaBD();
        instance.insere();
    }
    
}
