/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pornchitar.lab3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Lab3 {
    public int row;
    public int col;
    Scanner kb = new Scanner(System.in);
    public boolean play = false;
    public String start;
    public boolean end;
    public String turn;
    public String[][] board = {{"_", "_", "_"}, {"_", "_", "_"}, {"_", "_", "_"}};
    
    public static boolean checkRows(String[][] board,String turn,int row) {
        for (int j = 0; j < board[row - 1].length; j++) {
            if (!board[row - 1][j].equals(turn.toUpperCase())) {
                return false;
            }
        }
        return true;
    }
    
    

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}