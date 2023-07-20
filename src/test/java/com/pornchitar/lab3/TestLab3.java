/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.pornchitar.lab3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.pornchitar.lab3.Lab3;

/**
 *
 * @author ASUS
 */
public class TestLab3 {
    
    public TestLab3() {
        
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    @Test
    public void text(){
        String [][] board = {{"X","X","X"},{"-","-","-"},{"-","-","-"}};
        String turn = "X";
        int row = 1;
        Lab3.checkRows(board, turn, row);
        assertEquals(true, Lab3.checkRows(board, turn, row));
    }

    @Test
    public void testXWinInRow3(){
        String [][] board = {{"-","-","-"},{"-","-","-"},{"X","X","X"}};
        String turn = "X";
        int row = 2;
        Lab3.checkRows(board, turn, row);
        assertEquals(true, Lab3.checkRows(board, turn, row));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
