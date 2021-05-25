/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

import java.awt.event.ActionEvent;
import java.text.ParseException;
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
public class TelaTest {
    
    public TelaTest() {
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
     * Test of main method, of class Tela.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Tela.main(args);
    }

    /**
     * Test of actionPerformed method, of class Tela.
     */
    @Test
    public void testActionPerformed() throws ParseException {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        Tela instance = new Tela();
        instance.actionPerformed(e);
    }
    
}
