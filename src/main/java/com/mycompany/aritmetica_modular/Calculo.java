package com.mycompany.aritmetica_modular;

public class Calculo {

    public static int[][] sumaMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int suma = i + j;
                
                if (suma < matriz.length) {
                    matriz[i][j] = suma;
                    
                } else if (suma > matriz.length) {
                    suma = suma - matriz.length;
                    matriz[i][j] = suma;
                }
            }
        }
        return matriz;
    }
    

    public static int[][] mulMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; i++) {
                int multiplicacion = i * j;
                matriz[i][j] = multiplicacion % matriz.length;
            }
        }
        return matriz;
    }

}
