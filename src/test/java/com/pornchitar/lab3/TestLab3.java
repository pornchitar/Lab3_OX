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
    public void testXWinInRow1(){
        String [][] board = {{"X","X","X"},{"-","-","-"},{"-","-","-"}};
        String turn = "X";
        int row = 1;
        Lab3.checkRows(board, turn, row);
        assertEquals(true, Lab3.checkRows(board, turn, row));
    }

    @Test
    public void testXWinInRow2(){
        String [][] board = {{"-","-","-"},{"X","X","X"},{"-","-","-"}};
        String turn = "X";
        int row = 2;
        Lab3.checkRows(board, turn, row);
        assertEquals(true, Lab3.checkRows(board, turn, row));
    }

    @Test
    public void testXWinInRow3(){
        String [][] board = {{"-","-","-"},{"-","-","-"},{"X","X","X"}};
        String turn = "X";
        int row = 3;
        Lab3.checkRows(board, turn, row);
        assertEquals(true, Lab3.checkRows(board, turn, row));
    }

    @Test
    public void testOWinInRow1(){
        String [][] board = {{"O","O","O"},{"-","-","-"},{"-","-","-"}};
        String turn = "O";
        int row = 1;
        Lab3.checkRows(board, turn, row);
        assertEquals(true, Lab3.checkRows(board, turn, row));
    }
    
    @Test
    public void testOWinInRow2(){
        String [][] board = {{"-","-","-"},{"O","O","O"},{"-","-","-"}};
        String turn = "O";
        int row = 2;
        Lab3.checkRows(board, turn, row);
        assertEquals(true, Lab3.checkRows(board, turn, row));
    }
    
    @Test
    public void testOWinInRow3(){
        String [][] board = {{"-","-","-"},{"-","-","-"},{"O","O","O"}};
        String turn = "O";
        int row = 3;
        Lab3.checkRows(board, turn, row);
        assertEquals(true, Lab3.checkRows(board, turn, row));
    }

    @Test
    public void testXWinInCol1(){
        String [][] board = {{"X","-","-"},{"X","-","-"},{"X","-","-"}};
        String turn = "X";
        int col = 1;
        Lab3.checkColumns(board, turn, col);
        assertEquals(true, Lab3.checkColumns(board, turn, col));
    }

    @Test
    public void testXWinInCol2(){
        String [][] board = {{"-","X","-"},{"-","X","-"},{"-","X","-"}};
        String turn = "X";
        int col = 2;
        Lab3.checkColumns(board, turn, col);
        assertEquals(true, Lab3.checkColumns(board, turn, col));
    }

    @Test
    public void testXWinInCol3(){
        String [][] board = {{"-","-","X"},{"-","-","X"},{"-","-","X"}};
        String turn = "X";
        int col = 3;
        Lab3.checkColumns(board, turn, col);
        assertEquals(true, Lab3.checkColumns(board, turn, col));
    }

    @Test
    public void testOWinInCol1(){
        String [][] board = {{"O","-","-"},{"O","-","-"},{"O","-","-"}};
        String turn = "O";
        int col = 1;
        Lab3.checkColumns(board, turn, col);
        assertEquals(true, Lab3.checkColumns(board, turn, col));
    }

    @Test
    public void testOWinInCol2(){
        String [][] board = {{"-","O","-"},{"-","O","-"},{"-","O","-"}};
        String turn = "O";
        int col = 2;
        Lab3.checkColumns(board, turn, col);
        assertEquals(true, Lab3.checkColumns(board, turn, col));
    }

    @Test
    public void testOWinInCol3(){
        String [][] board = {{"-","-","O"},{"-","-","O"},{"-","-","O"}};
        String turn = "O";
        int col = 3;
        Lab3.checkColumns(board, turn, col);
        assertEquals(true, Lab3.checkColumns(board, turn, col));
    }

    @Test
    public void testXWinInDiagonals1(){
        String [][] board = {{"X","-","-"},{"-","X","-"},{"-","-","X"}};
        String turn = "X";
        int col = 1;
        int row = 1;
        Lab3.checkDiagonals(board, turn,row, col );
        assertEquals(true, Lab3.checkDiagonals(board, turn,row, col));
    }

    @Test
    public void testXWinInDiagonals2(){
        String [][] board = {{"-","-","X"},{"-","X","-"},{"X","-","-"}};
        String turn = "X";
        int col = 3;
        int row = 1;
        Lab3.checkDiagonals(board, turn, col, row);
        assertEquals(true, Lab3.checkDiagonals(board, turn, col, row));
    }

    @Test
    public void testOWinInDiagonals1(){
        String [][] board = {{"O","-","-"},{"-","O","-"},{"-","-","O"}};
        String turn = "O";
        int col = 1;
        int row = 1;
        Lab3.checkDiagonals(board, turn, col, row);
        assertEquals(true, Lab3.checkDiagonals(board, turn, col, row));
    }

    @Test
    public void testOWinInDiagonals2(){
        String [][] board = {{"-","-","O"},{"-","O","-"},{"O","-","-"}};
        String turn = "O";
        int col = 3;
        int row = 1;
        Lab3.checkDiagonals(board, turn, col, row);
        assertEquals(true, Lab3.checkDiagonals(board, turn, col, row));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
