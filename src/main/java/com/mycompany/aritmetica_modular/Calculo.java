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
        int llenado;
        int base = matriz.length;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                llenado = i * j;

                llenado = revisar(llenado, base);

                matriz[i][j] = llenado;
            }
        }
        return matriz;
    }

    public static int revisar(int n, int base) {
        while (n >= base) {

            n = n - base;
        }
        return n;
    }
}