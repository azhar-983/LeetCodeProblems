package com.lc.arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] input = {{1,2,3},{4,5,6},{7,8,9,10}};
        List<Integer> res = spiralOrder(input);
        System.out.println(res);
    }
    //Approach 1
    /*public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new LinkedList<Integer>();
        if(matrix == null || matrix.length == 0) return result;

        int startRow = 0, endRow = matrix.length-1;
        int startCol = 0, endCol = matrix[0].length - 1;
        int dir = 0;

        while(startRow <= endRow && startCol <= endCol) {
            switch(dir) {
                case 0: //RIGHT
                    for(int col = startCol; col <= endCol; col++)
                        result.add(matrix[startRow][col]);
                    startRow++;
                    break;
                case 1: //DOWN
                    for(int row = startRow; row <=endRow; row++)
                        result.add(matrix[row][endCol])    ;
                    endCol--;
                    break;
                case 2://LEFT
                    for(int col = endCol; col >= startCol; col --)
                        result.add(matrix[endRow][col]);
                    endRow--;
                    break;
                case 3://UP
                    for(int row = endRow; row >= startRow; row--)
                        result.add(matrix[row][startCol]);
                    startCol++;
                    break;
            }
            dir = (dir+1)%4;
        }

        return result;
    }*/

    //Approach II
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return list;

        int rowMin = 0, rowMax = matrix.length-1, colMin = 0, colMax = matrix[0].length-1;
        while(rowMin <= rowMax && colMin <= colMax) {
            for(int i=colMin; i<=colMax; i++) list.add(matrix[rowMin][i]);
            rowMin++;

            for(int i=rowMin; i<=rowMax; i++) list.add(matrix[i][colMax]);
            colMax--;

            if(rowMin > rowMax || colMin > colMax) break;

            for(int i=colMax; i>=colMin; i--) list.add(matrix[rowMax][i]);
            rowMax--;

            for(int i=rowMax; i>=rowMin; i--) list.add(matrix[i][colMin]);
            colMin++;
        }
        return list;
    }
}
