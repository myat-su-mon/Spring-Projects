package com.test;

public class RoutePlanner {

    public static boolean routeExists(int fromRow, int fromColumn, int toRow, int toColumn,
                                      boolean[][] mapMatrix) {
        for (int i=fromRow; i<=toRow; i++){
            for (int j=fromColumn; j<=toColumn; j++){
                if ((mapMatrix[i-1][j]) ||(mapMatrix[i+1][j])
                        || (mapMatrix[i][j-1]) || (mapMatrix[i][j+1])){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean[][] mapMatrix = {
                {true,  false, false},
                {true,  true,  false},
                {false, true,  true}
        };
        System.out.println(routeExists(0, 0, 2, 2, mapMatrix));
    }
}
