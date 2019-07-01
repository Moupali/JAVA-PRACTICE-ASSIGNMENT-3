/*Write a program to compute the addition of two matrix, Read the number of rows and columns
as input, also the values of each matrix
Output:
Input number of rows of matrix: 3
Input number of columns of matrix: 2
Input elements of first matrix: 1 2 3 4 5 6
Input the elements of second matrix: 9 8 7 6 5 4
Sum of the matrices:-
10 10
10 10
10 10*/

package com.stackroute.junittest3;

public class AddMatrices {

    public String addition(int row, int column, int matrix1[][], int matrix2[][]) {

        //initialisation
        int sum = 0;
        String output="";


        System.out.println("Enter elements in the array:");

        //Entering array elements
        for (int i = 0; i < row; i++)
        {

            for (int j = 0; j < column; j++)
            {

                sum = sum + matrix1[i][j] + matrix2[i][j];
                output = output + sum + " ";
            }

            System.out.println();
            output = output + "\n";
            sum = 0;
        }
        return output;
    }
}

