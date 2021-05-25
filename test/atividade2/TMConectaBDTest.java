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
public class TMConectaBDTest {
    
    public TMConectaBDTest() {
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
     * Test of insere method, of class TMConectaBD.
     */
    @Test
    public void testInsere() {
        System.out.println("insere");
        TMConectaBD instance = new TMConectaBDImpl();
        instance.insere();
    }

    public class TMConectaBDImpl extends TMConectaBD {

        public void insere() {
        }
    }
    
}
