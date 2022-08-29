/*
1. You are given a number n, the size of a chess board.
2. You are given a row and a column, as a starting point for a knight piece.
3. You are required to generate the all moves of a knight starting in (row, col) such that knight visits
     all cells of the board exactly once.
4. Complete the body of printKnightsTour function - without changing signature - to calculate and
     print all configurations of the chess board representing the route
     of knight through the chess board. Use sample input and output to get more idea.

Note -> When moving from (r, c) to the possible 8 options give first precedence to (r - 2, c + 1) and
               move in clockwise manner to
               explore other options.
Note -> The online judge can't force you to write the function recursively but that is what the spirit of
               question is. Write recursive and not iterative logic. The purpose of the question is to aid
               learning recursion and not test you.
*/
package com.Interview;

import java.util.*;

public class Main {

    public static void main(String[] args) {
    Scanner scn=new Scanner (System.in);
    int n = scn.nextInt();  //size of chess board
        int[][] chess=new int[n][n];
        int row=scn.nextInt();
        int col=scn.nextInt();
        int upcomingmove=1;

        printKnightsTour(chess,row,col,upcomingmove);

    }

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        int n= chess.length;
        if(r < 0 || c < 0 || r >= chess.length || c >= chess.length || chess[r][c] != 0){
            return;
        } else if(upcomingMove == chess.length * chess.length){
            chess[r][c] = upcomingMove;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }

        chess[r][c]=upcomingMove;
    printKnightsTour(chess,r-2,c+1,upcomingMove+1);    //1
    printKnightsTour(chess,r-1,c+2,upcomingMove+1);    //2
    printKnightsTour(chess,r+1,c+2,upcomingMove+1);    //3
    printKnightsTour(chess,r+2,c+1,upcomingMove+1);    //4

    printKnightsTour(chess,r+2,c-1,upcomingMove+1);    //5
    printKnightsTour(chess,r+1,c-2,upcomingMove+1);    //6
    printKnightsTour(chess,r-1,c-2,upcomingMove+1);    //7
    printKnightsTour(chess,r-2,c-1,upcomingMove+1);    //8

        chess[r][c]=0;

    }

    public static void displayBoard(int[][] chess){
        for (int[] ints : chess) {
            for (int j = 0; j < chess[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}