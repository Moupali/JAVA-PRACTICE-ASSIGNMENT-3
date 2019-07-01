/*5. Write a program to create a ChessBoard pattern with the help of multidimensional array, where
WWrepresents white color and BB represents Black color.
Output:
My Chess Board
WW|BB|WW|BB|WW|BB|WW|BB|
BB|WW|BB|WW|BB|WW|BB|WW|
WW|BB|WW|BB|WW|BB|WW|BB|
BB|WW|BB|WW|BB|WW|BB|WW|
WW|BB|WW|BB|WW|BB|WW|BB|
BB|WW|BB|WW|BB|WW|BB|WW|
WW|BB|WW|BB|WW|BB|WW|BB|
BB|WW|BB|WW|BB|WW|BB|WW|*/

package com.stackroute.junittest3;
public class ChessBoardProblem {
    public String printChessBoard()
    {
        String board[][]=new String[8][8];
        String result="";
        int i,j;
        for(i=0;i<8;i++) {
            for (j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = "WW|";
                } else {
                    board[i][j] = "BB|";
                }
            }
        }
            System.out.println("--------CHESS BOARD--------");
            for (i = 0; i < 8; i++) {
                for (j = 0; j < 8; j++) {
                    System.out.print(board[i][j]);
                    result = result + board[i][j];

                }
                System.out.println();
                result = result + "\n";
            }
        return result;

    }

}
